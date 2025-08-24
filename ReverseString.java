//package JunitTesting;

public class ReverseString {
	
	public String reverseString(String str)
	{
		char[] charArray=str.toCharArray();
		int left=0;
		int right=str.length()-1;
		while(left<right)
		{
			char temp=charArray[left];
			charArray[left]=charArray[right];
			charArray[right]=temp;
			left++;
			right--;
		}
		return new String(charArray);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString reverse=new ReverseString();
		String result=reverse.reverseString("programming");
		System.out.println(result);
	}

}
