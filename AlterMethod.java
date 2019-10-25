package hbase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class AlterMethod {
	public static void main(String[] args) throws IOException {

		Configuration conf = HBaseConfiguration.create();
		
		HBaseAdmin admin = new HBaseAdmin(conf);
		
		HColumnDescriptor des = new HColumnDescriptor("marks_info");
	      
	      // Adding column family and altering the table
	      admin.addColumn("student", des);
	      System.out.println("coloumn Family added");
	}
}
