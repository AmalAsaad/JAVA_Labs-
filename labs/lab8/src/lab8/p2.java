package lab8;

public class p2 {
	public static int removeElement(char[] list,int lenghused,int removeindex ) {
		int newsize;
		for(int i= removeindex; i<lenghused ;i++)
			list[i]=list[i+1];
		newsize=lenghused-1;
		return newsize;
		
		
	}

	public static void deleterepeat(char list, int lengh) {
		char[]list=new char[10];
		char temp;
		for(int i=0; i<lengh; i++)
			if(list[i]==temp)
				removeElement(list, lenghused, removeindex);
			
			
		
		
	}
	public static void main(String[] args) {
		int lenghused=0;
		char[] arr=new char[10];
		arr[0]='a';
		arr[1]='c';
		arr[2]='a';
		arr[3]='b';
		arr[4]='d';
	    lenghused=5;
	    int newsize=deleterepeat(arr, lenghused);

		for(int i=0; i<newsize; i++)
			System.out.println(arr[i]);
			
		
		
	}

}
