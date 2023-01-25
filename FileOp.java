import java.io.File;
import java.util.*;
public class FileOp {
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the file name:");
		String fname=obj.next();
		File f=new File(fname);
		f.setWritable(true);
		System.out.println(f.exists()?"File Exists":"File Does not Exists");
		System.out.println(f.canWrite()?"File Writable":"File Does not Writable");
		System.out.println(f.canRead()?"File Readable":"File Does ot Readable");
		String filename=f.toString();
		int index=filename.lastIndexOf('.');
		if(index>0){
		String type=filename.substring(index+1);
		System.out.println("File type is:"+type);
	}
	else
		System.out.println("File does not have File");
	System.out.println("File Size:"+f.length()+"Bytes");
	}
}


	

