import java.io.*;
class  charDemo
{
	public static void main(String[] args) throws IOException
	{
		char[] arr1 = {'r','o','o','b'};
		System.out.println(arr1);
		String arr2 = new String("roobnnn");
		System.out.println(arr2);
		System.out.println(arr2.length());
		String arr3 = new String("lllll");
		arr2 = arr2.concat(arr3);
		System.out.println(arr2);
		Character cha = arr2.charAt(5);
		System.out.println(cha);
		System.out.println(arr2.indexOf("n"));
		System.out.println("..................................");
		StringBuffer sB = new StringBuffer("我的名字");
		sB.append("叫");
		sB.append("刘争");
		//System.out.println(sB.delete(1,2));
		//System.out.println(sB.replace(1,2,"得的"));
		System.out.println(sB.capacity());
		System.out.println(sB.length());
		Integer[] arr = new Integer[10];
		System.out.println(arr.length);
		arr[0]=0;
		arr[1]=1;
		System.out.println(arr.toString());
		for(int i =0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		Double[] list = new Double[]{4.4,2.2,3.3};
		for(double ele : list){
		System.out.println(ele);
		java.util.Arrays.sort(list);
		System.out.println(list);
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("输入q退出");
		char c;
	}
}
