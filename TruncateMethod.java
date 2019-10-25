package hbase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.util.Bytes;

public class TruncateMethod {
	public static void main(String[] args) throws IOException, MasterNotRunningException  {
		Configuration conf = HBaseConfiguration.create();
		
		HBaseAdmin admin = new HBaseAdmin(conf);
		admin.disableTable(Bytes.toBytes("student"));
		admin.truncateTable("student", true);
		admin.enableTable("student");

	}
}
