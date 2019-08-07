package lt.baltictalents.projectname.mavenProject;

public class Power {

	public int power(int x, int n) {
		int z = 1;
		for (int i = 0; i < n; i++) {
			z *= x;
		}
		return z;
	}
	
}
