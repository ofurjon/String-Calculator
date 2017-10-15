package is.ru;

public class Calculator{

	public static int add(String text)
	{
	    if(text.equals(""))
	    	return 0;
	    else
	    {
	   	    if(text.contains("//"))
	    	{
	    		String delimAndText[] = text.split("\\n", 2);
	    		String delim[] = delimAndText[0].split("//");
	    		String numbers[] = delimAndText[1].split(delim[1] + "|,\\n");
	    		checkForNeg(numbers);
    			return sum(numbers);
	    	}
	    	else if(has(text))
	    	{
	    		String numbers[] = text.split(",|\\n");
			  	checkForNeg(numbers);
    			return sum(numbers);
    		}
    	return 1;
		}
    }

	private static void checkForNeg(String[] numbers)
  	{
  		String negNumbers[] = new String[numbers.length];
	  	int count = 0;
	  	boolean hasNeg = false;
	  	for (String number : numbers)
		{
			if(Integer.parseInt(number) < 0)
			{
				hasNeg = true;
				negNumbers[count] = number;
				count++;
			}
		}
		if (hasNeg)
		{
			throw new IllegalArgumentException(
				"Negative numbers not allowed" + negNumbers);
		}
  	}

  	private static int toInt(String number)
  	{
		if(Integer.parseInt(number) > 1000)
			return 0;
		else
			return Integer.parseInt(number);
  	}

    private static int sum(String[] numbers)
    {
  		int total = 0;
		for (String number : numbers)
		{
			total += toInt(number);
		}
		return total;  
  	}
  	
  	private static boolean has(String text)
  	{
  		return (text.contains(",") || text.contains("\n"));
  	}
}

