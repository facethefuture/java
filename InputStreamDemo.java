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
			//������д���ļ�
			int[] arr ={1,2,3,4};
			OutputStream os = new FileOutputStream("test.txt");
			for(int i =0;i<arr.length;i++){
			os.write(arr[i]);
			}
			os.close();
			//��ȡ�ļ��е�����
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
			//ԭ���ķ�����fs.write("xx"),���ڻ���OutputStreamWriter��д�뷽��
			OutputStreamWriter writer= new OutputStreamWriter(fs,"UTF-8");
			//д�뵽������
			writer.append("��������");
			writer.append("\r\n");
			writer.append("English Input");
			//�رջ�����д����
			writer.close();
			//�ر������
			fs.close();
			//�ո��ǽ�����д�뵽���ļ����棬��������ȡ�ļ�
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
