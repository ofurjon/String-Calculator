package is.ru;

public class Calculator{

  public static int add(String text)
  {
    if(text.equals(""))
    	return 0;
    else
    {
    	if(has(text))
    	{
    		String numbers[] = text.split(",|\\n");
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
				throw new IllegalArgumentException("negNumbers");
			}

    		return sum(numbers);
    	}
    	return 1;
    }
  }


  private static int toInt(String number)
  {
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

