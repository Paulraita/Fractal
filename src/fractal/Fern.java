package fractal;

public class Fern implements FractalModel{
	private double[] p;
	private double[][] ps;
	public Fern(){
		init();
	}
	private void init(){
		p=new double[4];
		ps=new double[4][6];
		p[0]=0.01; p[1]=0.85; p[2]=0.07; p[3]=0.07;
		ps[0][0]=0; ps[0][1]=0; ps[0][2]=0; ps[0][3]=0.16; ps[0][4]=0; ps[0][5]=0;
		ps[1][0]=0.85; ps[1][1]=0.04; ps[1][2]=-0.04; ps[1][3]=0.85; ps[1][4]=0; ps[1][5]=0.16;
		ps[2][0]=0.2; ps[2][1]=-0.26; ps[2][2]=0.23; ps[2][3]=0.22; ps[2][4]=0; ps[2][5]=0.16;
		ps[3][0]=-0.15; ps[3][1]=0.28; ps[3][2]=0.25; ps[3][3]=0.24; ps[3][4]=0; ps[3][5]=0.16;
	}
	public double[][] getParameter(){
		return ps;
	}
	public int selectParameter(double ran){
		if (0<=ran && ran<=p[0]){
			return 0;
		}else if (p[0]<ran && ran<=p[0]+p[1]){
			return 1;
		}else if (p[0]+p[1]<ran && ran<=p[0]+p[1]+p[2]){
			return 2;
		}else if (p[0]+p[1]+p[2]<ran && ran<=1){
			return 3;
		}else{
			return -1;
		}
	}
}