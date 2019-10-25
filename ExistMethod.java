package hbase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class ExistMethod {
	public static void main(String[] args) throws IOException {

		Configuration conf = HBaseConfiguration.create();
		
		HBaseAdmin admin = new HBaseAdmin(conf);
		
		boolean bool = admin.tableExists("student");
	      System.out.println( bool);
	}
}
