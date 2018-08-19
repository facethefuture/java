import java.io.*;	
class  InputStreamDemo
{
	public static void main(String[] args) 
	{
		try{
			File f = new File("D:/abc/test.txt");
		InputStream out = new FileInputStream(f);
		} catch(IOException e){
		System.out.println("Exception");
		}

		try
		{
			//将数组写入文件
			int[] arr ={1,2,3,4};
			OutputStream os = new FileOutputStream("test.txt");
			for(int i =0;i<arr.length;i++){
			os.write(arr[i]);
			}
			os.close();
			//读取文件中的数据
			InputStream is = new FileInputStream("test.txt");
			int size =is.available();
			for(int i =0;i<size;i++){
			System.out.println((char) is.read() + "  ");
			}
			is.close();
		}
		catch (IOException e)
		{
			System.out.println("Exception");
		}
		try{
			File f = new File("a.txt");
			FileOutputStream fs = new FileOutputStream(f);
			//原来的方法是fs.write("xx"),现在换成OutputStreamWriter的写入方法
			OutputStreamWriter writer= new OutputStreamWriter(fs,"UTF-8");
			//写入到缓冲区
			writer.append("中文输入");
			writer.append("\r\n");
			writer.append("English Input");
			//关闭缓冲区写入流
			writer.close();
			//关闭输出流
			fs.close();
			//刚刚是将数据写入到了文件里面，现在来读取文件
			FileInputStream fip = new FileInputStream(f);
			InputStreamReader reader = new InputStreamReader(fip,"UTF-8");
			StringBuffer sb = new StringBuffer();
			while(reader.ready()){
			sb.append((char) reader.read());
			}
			System.out.println(sb.length());
			System.out.println(sb.toString());
			File newFile = new File("E:\\codes");
			System.out.println(newFile.isFile());
			String[] fileList = newFile.list();
			for(String ele: fileList){
				File file2 = new File("E:/codes/"+ele);
				//System.out.println(file2.isFile());
				if(file2.isDirectory()){
					System.out.println(ele);

				}
								

			}

		}catch(IOException e){
			System.out.println("Exception");
		}
		File newFile2 = new File("E:\\codes");
		File[] fileArr = newFile2.listFiles();
		for(int i =0;i<fileArr.length;i++){
		
			System.out.println(fileArr[i]);
		}
		//System.out.println(SB);
	
		//for(String)
		
	}
}
