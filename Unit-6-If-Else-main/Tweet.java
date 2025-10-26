class Tweet
{
	private String message;
	//add 2 more instance variables
	private int r;
	private int lk;
	
	public Tweet( String m, int r, int lk )
	{
		message = m;
		r = 0;
		lk = 0;
	}
	
	public void addLikes( int n )
	{
		lk += n;
	}
	
	public void addRetweets( int n )
	{
		r += n;
	}
	
	public boolean notLiked()
	{
		if(lk < 10) {
			return true;
		}
		return false;
	}
	
	public boolean kindaLiked()
	{
		if (lk > r)
			return true;
		return false;

	}
	
	public boolean isTrending()
	{
		if (r + lk > 75) {
			return true;
		}
		return false;
	}
	
	public String toString()
	{
		return "msg " + "\"" + message + "\" rt " + r + " lk " + lk;
	}
}