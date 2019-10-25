package hbase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class ListMethod {
	public static void main(String[] args) throws IOException {
		Configuration conf = HBaseConfiguration.create();
		
		HBaseAdmin admin = new HBaseAdmin(conf);
		
		HTableDescriptor[] des = admin.listTables();
		
		for (int k=0; k<des.length;k++ ){
			System.out.println(des[k].getNameAsString());      // Print all the table names.
			}
	}
}
