class DuplicateCount
{
	public static void main(String[] args)
	{
		duplicateCharCount("Fresher World");
		System.out.println();
		duplicateCharCount("Mathematics");
		duplicateCharCount("Scientists");
	}

	static void duplicateCharCount(String s)
	{
		s=s.toLowerCase();
		int len=s.length();
		int count=0;
		System.out.println("for " + s);
		while(s.length()>0) {
			char c=s.charAt(0);
			count=s.length()-s.replace("" + c, "").length();
			System.out.println(c + " " + count);
			s=s.replace("" + c, "");
		}
		return ;
	}
}


