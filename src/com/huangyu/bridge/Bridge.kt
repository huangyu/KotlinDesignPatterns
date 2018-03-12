package com.huangyu.bridge

class Bridge {
	
	interface IPicture {
		fun display()
	}

	class PNG : IPicture {
		override fun display() {
			println("PNG")
		}
	}

	class JPG : IPicture {
		override fun display() {
			println("JPG")
		}
	}

	abstract class System(val pic: IPicture) {
		abstract fun showPic()
	}

	class Mac : System(pic = JPG()) {
		override fun showPic() {
			pic.display()
		}
	}

	class Linux : System(pic = PNG()) {
		override fun showPic() {
			pic.display()
		}
	}

	class Window : System(pic = JPG()) {
		override fun showPic() {
			pic.display()
		}
	}
	
}