package Demo_1;

public class Str_1 {
//count occurrence of each character in a string
	public static void main(java.lang.String[] args) {
		String s1 = "shaaaamm";
		char ch [] = s1.toCharArray();
		int n = ch.length;
		
		for (int i = 0; i <n; i++) 
		{
			if(ch[i]!=0)
			{
				int count  = 1;
				for (int j = i+1; j<n; j++) 
				{
					
					
					{
						if(ch[i]==ch[j])
						{
							count++;
							ch[j]=0;
							
						}
					}
					
					
				}
				System.out.println(ch[i]+" "+count);
			}
			
			
			
		
		}

	}

}
