/*control statement-->>programming language uses control statement to cause the flow of execution to advance and branch to the state of a program.
types of control statement:
->selecton
->iteration
-> jump
selction statement:java supports two selecton statement: 
-->if
-->switch
if: SYNTAX->  if(codition)statement1;
			  else statement2;
nested ifs: Synaax-> if(condition)
			{
				statement1;
				if(condition)
				{
					statement;
				}
			}
the if-else-if ladder: Syntax-> if(condition)
						statement;
						else if(condition)
						statement;
						else if(condition)
						statement;
						.
						.
						.
						else
						statement
*/
class control_statement
{
	public static void main(String []k)
	{
		int month =4;
		String season;
		
		if(month==12||month==1||month==2)
			season="winter";
		else if(month==3||month==4||month==5)
			season="spring";
		else if(month==6||month==7||month==8)
			season="summer";
		else if(month==9||month==10||month==11)
			season="autum";
		else 
			season="bogus month";
		
		System.out.println("April is in the "+season+".");
	}
}
/* switch statements
switch (expression) 
{
	case value1:
		statement sequence
	break;
	case value2:
		statement sequence
	break;
	.
	.
	.
	case valueN :
		statement sequence
	break;
	default:
		default statement sequence
}
*/
class SwitchPoint
{
	public static void main(String []k)
	{
		for(int i=0;i<6;i++)
		{
			switch(i)
			{
				case 0:
					System.out.println("zero");
					break;
				case 1:
					System.out.println("one");
					break;
				case 3:
					System.out.println("three");
					break;
				case 4:
					System.out.println("four");
					break;
				case 5:
					System.out.println("five");
					break;
				default:
					System.out.println("nothing");
			}
		}
	}
}

					