package afriat.frank.tools.maven;

import org.apache.maven.cli.MavenCli;

public class Main {

	public static void main(String[] args) {
		MavenCli cli = new MavenCli();
		cli.doMain( args, ".", System.out, System.err );
	}

}
