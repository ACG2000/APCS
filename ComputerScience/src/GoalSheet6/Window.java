package GoalSheet6;

public class Window implements Windows{
	String Name = null;
	int Xpos, Ypos, length, width;
	public Window(int x, int y, String name, int l, int w) {
		Name = name;
		Xpos = x;
		Ypos = y;
		length = l;
		width = w;
	}	
		@Override
		public int GetXpos() {
			return Xpos;
		}
		@Override
		public int GetYpos() {
			// TODO Auto-generated method stub
			return Ypos;
		}
		@Override
		public int GetLength() {
			// TODO Auto-generated method stub
			return length;
		}
		@Override
		public int GetWidth() {
			// TODO Auto-generated method stub
			return width;
		}
		@Override
		public String GetName() {
			// TODO Auto-generated method stub
			return Name;
		}
			
		
}