package demo25;


public class QueryString {
	private String  _query;

	public QueryString(String quequeryString) {
		if (quequeryString == null)
			throw new NullPointerException();
		this._query = quequeryString;
	}

	public int count() {
		if ("".equals(_query))
			return 0;
		String[] pairs = _query.split("&");
		return pairs.length;
	}

	public String valueFor(String name) {
		String[] pairs = _query.split("&");
		for (String pair : pairs) {
			String[] nameAndValue = pair.split("=");
			if (nameAndValue[0].equals(name))
				return nameAndValue[1];
		}
		throw new RuntimeException("name=" + name + "not  found");
	}

 }
