package hbase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class DropAllMethod {
	public static void main(String[] args) throws IOException {

		Configuration conf = HBaseConfiguration.create();
		
		HBaseAdmin admin = new HBaseAdmin(conf);
		
		// disable the table
	    admin.disableTable("student");

	    // drop all table
	    admin.deleteTable("s.*");
	    System.out.println("Tables deleted");
	}
}
