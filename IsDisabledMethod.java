package hbase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class IsDisabledMethod {
	public static void main(String[] args) throws IOException {

		Configuration conf = HBaseConfiguration.create();
		
		HBaseAdmin admin = new HBaseAdmin(conf);
		
	    Boolean bool = admin.isTableDisabled("student");
	    
	    System.out.println(bool);
	}
}
