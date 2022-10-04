import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    public Main() {
        JPanel pan1 = new JPanel();	//pan1이라는 패널 생성
        JButton btn1 = new JButton("Hello");	//btn1이라는 버튼 생성
        btn1.addActionListener(new ActionListener() {	//btn1을 눌렀을 때 효과추가
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You have been clicked!");	//화면 가운데에 메시지출력
            }
        });

        add(pan1);  //pan1을 추가
        pan1.add(btn1);	//pan1안에 btn1을 추가

        setVisible(true);	//창을 눈에 보이도록 함
        setSize(640, 480);	//사이즈는 640*480
        setResizable(false);	//사이즈 재조정 불가능
        setLocationRelativeTo(null);	//창이 가운데에 뜨도록 함
        setDefaultCloseOperation(EXIT_ON_CLOSE);	//창을 끄면 프로그램을 종료
    }

    public static void main(String[] args) {
        new Main();
    }
}
