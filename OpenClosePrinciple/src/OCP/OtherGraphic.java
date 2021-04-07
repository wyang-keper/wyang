package OCP;

//新增一个形状
	class OtherGraphic extends Shape{
	    OtherGraphic(){
	        super.m_type=4;
	    }
	    @Override
	    public void display() {
	        System.out.println("其它形状按钮");
		}

	}