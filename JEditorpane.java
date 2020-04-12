import javax.swing.JEditorPane;  
import javax.swing.JFrame;  
  public class JEditorPaneEx 
	  {  
    JFrame myFrame = null;  
    public static void main(String[] a) 
	{  
        (new JEditorPaneEx()).test();  
    }  
  
    private void test()
		{  
        myFrame = new JFrame("JEditorPane Test");  
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        myFrame.setSize(400, 200);  
        JEditorPane myPane = new JEditorPane();  
        myPane.setContentType("text/plain");  
        myPane.setText("player "  
                + "unknown "  
                + "battle");  
        myFrame.setContentPane(myPane);  
        myFrame.setVisible(true);  
    }  
}  
