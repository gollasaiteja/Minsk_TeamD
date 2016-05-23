public class RootStorage {
 double[] roots;

 public void setSize(int size) {
	roots = new double[size+1];
 }
 
 public void setRoot(int idx, double root) {
	 this.roots[idx] = root;	 
 }
 
 public double getRoot(int idx) {
		return this.roots[idx];
 }
 
 public double[] getRoots() {
	 return this.roots;
 }
}
