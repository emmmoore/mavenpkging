package geometry.area.circle;
​
public class App {
​
		public double radius;
		public App(){
			radius = 5.0;
		}
		public App(double radiusR){
			this.radius = radiusR;
		}
		public double getRadius(){
			return this.radius;
		}
		public void setRadius(double radiusR){
			this.radius = radiusR;
		}
		public double getCircleArea(){
			return (Math.PI*radius*radius);
		}
​
		public static void main(String[] args){
			App a = new App(5);
			System.out.println("Circle with Radius = 5.0 has Area: " + a.getCircleArea());
		}
	}