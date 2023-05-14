package Game;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
// import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Task2 extends javax.swing.JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static int chance=0;
    static int[][] board= new int[3][3];
    static int[] blank=new int[9];
    static List<Integer> H= new ArrayList<Integer>();
    static List<Integer> C = new ArrayList<Integer>();
    static int[] magicSq=new int[9];
    static int h=0;
    private String startGame="X";
   static int hCount=0;
    static int cCount=0;
        static int t=0;

    
    public Task2() {
        initComponents();
        setSize(1200,600);
        setLocationRelativeTo(null);
        
    }
    private void gameScore(){
        jlblPlayerX.setText(String.valueOf(hCount));
        jlblPlayerO.setText(String.valueOf(cCount));
    }
    private void choose_a_Player()
    {
        if(startGame.equalsIgnoreCase("X")){
            startGame="O";
        }
        else{
            startGame="X";
        }
    }
    // @SuppressWarnings("unchecked")
    private void initComponents() {

        new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        bt1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        bt2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        bt3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jlblPlayerX = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        bt4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        bt5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        bt6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jlblPlayerO = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        bt7 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        bt8 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        bt9 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jbtnreset = new javax.swing.JButton();
        tie = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jbtnexit = new javax.swing.JButton();
        lble = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setSize(new java.awt.Dimension(400, 400));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        bt1.setFont(new java.awt.Font("Tahoma", 1, 75));
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        jPanel3.add(bt1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        bt2.setFont(new java.awt.Font("Tahoma", 1, 75));
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        jPanel4.add(bt2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        bt3.setFont(new java.awt.Font("Tahoma", 1, 75));
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        jPanel5.add(bt3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36));
        jLabel4.setText("User:");
        jPanel6.add(jLabel4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jlblPlayerX.setFont(new java.awt.Font("Tahoma", 1, 36));
        jlblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerX.setText("0");
        jPanel7.add(jlblPlayerX, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        bt4.setFont(new java.awt.Font("Tahoma", 1, 75));
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });
        jPanel8.add(bt4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        bt5.setFont(new java.awt.Font("Tahoma", 1, 75));
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });
        jPanel9.add(bt5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        bt6.setFont(new java.awt.Font("Tahoma", 1, 75));
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });
        jPanel10.add(bt6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36));
        jLabel5.setText("Computer:");
        jPanel11.add(jLabel5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jlblPlayerO.setFont(new java.awt.Font("Tahoma", 1, 36));
        jlblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerO.setText("0");
        jPanel12.add(jlblPlayerO, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());

        bt7.setFont(new java.awt.Font("Tahoma", 1, 75));
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });
        jPanel13.add(bt7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.BorderLayout());

        bt8.setFont(new java.awt.Font("Tahoma", 1, 75));
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });
        jPanel14.add(bt8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());

        bt9.setFont(new java.awt.Font("Tahoma", 1, 75));
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });
        jPanel15.add(bt9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jbtnreset.setFont(new java.awt.Font("Tahoma", 1, 36));
        jbtnreset.setText("Reset");
        jbtnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnresetActionPerformed(evt);
            }
        });
        jPanel16.add(jbtnreset, java.awt.BorderLayout.CENTER);

        tie.setFont(new java.awt.Font("Myanmar Text", 1, 18));
        tie.setForeground(new java.awt.Color(102, 0, 102));
        tie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tie.setText("Ties: 0");
        jPanel16.add(tie, java.awt.BorderLayout.PAGE_START);

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(204, 255, 204));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jbtnexit.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jbtnexit.setText("Start Game");
        jbtnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnexitActionPerformed(evt);
            }
        });
        jPanel17.add(jbtnexit, java.awt.BorderLayout.CENTER);

        lble.setBackground(new java.awt.Color(204, 204, 255));
        lble.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14));
        lble.setForeground(new java.awt.Color(153, 0, 153));
        lble.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lble.setText("Start the Game here!!");
        jPanel17.add(lble, java.awt.BorderLayout.PAGE_START);

        jPanel2.add(jPanel17);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {
        bt6.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            bt6.setForeground(Color.red);
        }
        else{
            bt6.setForeground(Color.GREEN);
        }
        choose_a_Player();
        chance++;
        if(win(6)==1){
               JOptionPane.showMessageDialog(this,"User Wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
               hCount++;

        }
        else if(chance%2==0 && h==0){
            H.add(6);
         blank[5]=1;
        gamec(chance);
        }
        else if(chance%2!=0 && h==1){
        H.add(6);
   blank[5]=1;
   game(chance);
        }
        bt6.setEnabled(false);
    }

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {
        bt4.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            bt4.setForeground(Color.red);
        }
        else{
            bt4.setForeground(Color.GREEN);
        }
        choose_a_Player();
        chance++;
        if(win(4)==1){
                JOptionPane.showMessageDialog(this,"User Wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                hCount++;

        }
        else if(chance%2==0 && h==0){
            H.add(4);
         blank[3]=1;
        gamec(chance);
        }
        else if(chance%2!=0 && h==1){
            
            H.add(4);
   blank[3]=1;
   game(chance);
        }
        bt4.setEnabled(false);
    }
private JFrame frame;
    private void jbtnexitActionPerformed(java.awt.event.ActionEvent evt) {
        frame=new JFrame("Exit");
        if(jbtnexit.getText()=="Start Game"){
            if(JOptionPane.showConfirmDialog(frame,"Do you want to Play first?","Tic Tac Toe",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
                h=1;
            if(h==0){
                gamec(0);
            }
                
            jbtnexit.setText("Exit");
            lble.setText("Exit Game here!!");
        
        }
        else{
        
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to Exit the Game","Tic Tac Toe",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
        }
    }

    private void jbtnresetActionPerformed(java.awt.event.ActionEvent evt) {
        
        bt1.setText(null);
        bt2.setText(null);
        bt3.setText(null);
        
        bt4.setText(null);
        bt5.setText(null);
        bt6.setText(null);
        
        bt7.setText(null);
        bt8.setText(null);
        bt9.setText(null);
        
        bt1.setBackground(Color.LIGHT_GRAY);
        bt2.setBackground(Color.LIGHT_GRAY);
        bt3.setBackground(Color.LIGHT_GRAY);
        
        bt4.setBackground(Color.LIGHT_GRAY);
        bt5.setBackground(Color.LIGHT_GRAY);
        bt6.setBackground(Color.LIGHT_GRAY);
        
        bt7.setBackground(Color.LIGHT_GRAY);
        bt8.setBackground(Color.LIGHT_GRAY);
        bt9.setBackground(Color.LIGHT_GRAY);
        
        bt1.setEnabled(true);
        bt2.setEnabled(true);
        bt3.setEnabled(true);
        
        bt4.setEnabled(true);
        bt5.setEnabled(true);
        bt6.setEnabled(true);
        
        bt7.setEnabled(true);
        bt8.setEnabled(true);
        bt9.setEnabled(true);
        chance=0;
        H.clear();
        C.clear();
        h=0;
        choose_a_Player();
        for(int i=0; i<9;i++){
        
        blank[i]=-1;
    }
        if(JOptionPane.showConfirmDialog(frame,"Do you want to Play first?","Tic Tac Toe",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
                h=1;
            if(h==0){
                gamec(0);
            }
    }

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {
        chance++;
    bt1.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            bt1.setForeground(Color.red);
        }
        else{
            bt1.setForeground(Color.GREEN);
        }
        choose_a_Player();
        if(win(1)==1){
                   JOptionPane.showMessageDialog(this,"User Wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                   hCount++;
                   gameScore();

        }
        else if(chance%2==0 && h==0){
            H.add(1);
         blank[0]=1;
        gamec(chance);
        }
        else if(chance%2!=0 && h==1){
         H.add(1);
         blank[0]=1;
        game(chance);
        }
        bt1.setEnabled(false);
        
    }
    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {
        chance++;
        bt2.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            bt2.setForeground(Color.red);
        }
        else{
            bt2.setForeground(Color.GREEN);
        }
        choose_a_Player();
        if(win(2)==1){
                   JOptionPane.showMessageDialog(this,"User Wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                   hCount++;
                   gameScore();

        }
        else if(chance%2==0 && h==0){
            H.add(2);
         blank[1]=1;
        gamec(chance);
        }
        else if(chance%2!=0 && h==1){
        
        H.add(2);
   blank[1]=1;
   game(chance);
        }
        bt2.setEnabled(false);
    }

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {
        bt3.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            bt3.setForeground(Color.red);
        }
        else{
            bt3.setForeground(Color.GREEN);
        }
        choose_a_Player();
        chance++;
        if(win(3)==1){
                JOptionPane.showMessageDialog(this,"User Wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                hCount++;
                gameScore();

        }
        else if(chance%2==0 && h==0){
            H.add(3);
         blank[2]=1;
        gamec(chance);
        }
        else if(chance%2!=0 && h==1){
        
        H.add(3);
   blank[2]=1;
   game(chance);
        }
        bt3.setEnabled(false);
    }

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {
        bt5.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            bt5.setForeground(Color.red);
        }
        else{
            bt5.setForeground(Color.GREEN);
        }
        choose_a_Player();
        chance++;
        if(win(5)==1){
              JOptionPane.showMessageDialog(this,"User Wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
              hCount++;
              gameScore();

        }
        else if(chance%2==0 && h==0){
            H.add(5);
         blank[4]=1;
        gamec(chance);
        }
        else if(chance%2!=0 && h==1){
       
        H.add(5);
   blank[4]=1;
    game(chance);
        }
        bt5.setEnabled(false);
    }
    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {
        bt7.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            bt7.setForeground(Color.red);
        }
        else{
            bt7.setForeground(Color.GREEN);
        }
        choose_a_Player();
        chance++;
        if(win(7)==1){
                 JOptionPane.showMessageDialog(this,"User Wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                  hCount++;

        }
        else if(chance%2==0 && h==0){
            H.add(7);
         blank[6]=1;
        gamec(chance);
        }
        else if(chance%2!=0 && h==1){
        
        H.add(7);
   blank[6]=1;
   game(chance);
        }
        bt7.setEnabled(false);
    }

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {
        bt8.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            bt8.setForeground(Color.red);
        }
        else{
            bt8.setForeground(Color.GREEN);
        }
        choose_a_Player();
        chance++;
        if(win(8)==1){
                 JOptionPane.showMessageDialog(this,"User Wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                  hCount++;
                  gameScore();

        }
        else if(chance%2==0 && h==0){
            H.add(8);
         blank[7]=1;
        gamec(chance);
        }
        else if(chance%2!=0 && h==1){
        
        H.add(8);
   blank[7]=1;
   game(chance);
        }
        bt8.setEnabled(false);
    }

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {
        bt9.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            bt9.setForeground(Color.red);
        }
        else{
            bt9.setForeground(Color.GREEN);
        }
        choose_a_Player();
        chance++;
        if(win(9)==1){
                  JOptionPane.showMessageDialog(this,"User Wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                   hCount++;

        }
        else if(chance%2==0 && h==0){
            H.add(9);
         blank[8]=1;
        gamec(chance);
        }
        else if(chance%2!=0 && h==1){
        
        H.add(9);
   blank[8]=1;
   game(chance);
        }
        bt9.setEnabled(false);
    }

    public static void main(String args[]) {
      
        magicSq=magicSquare();
    for(int i=0; i<9;i++){
        System.out.println(magicSq[i]);
        blank[i]=-1;
    }
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Task2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Task2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Task2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Task2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Task2().setVisible(true);
                
            }
        });
    }
    
    public void gamec(int x){
        
 if(x==0){
 System.out.println("Move 1: Computer's Chance");

 if(!H.contains(5)){
       if(go(4,0)){
           C.add(5);
           blank[4]=0;
           cli(5);
       }
   }
 }
 if(x==2){
         
  if(!H.contains(9)){
       if(go(8,0)){
           C.add(9);
           blank[8]=0;
           cli(9);
       }
   }
  else{
      go(Make_2(0)-1,0);
       blank[Make_2(0)-1]=0;

       C.add(Make_2(0));
       cli(Make_2(0));
  }
 }
 if(x==4){
 int b=PossWin(C);
   if(b!=0){
       go(b-1,0);
       C.add(b);
       blank[b-1]=0;
       cli(b);
             JOptionPane.showMessageDialog(this,"Computer Wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             cCount++;
             gameScore();
   }
   else{
        int e=PossWin(H);
       
       if(e!=0){
       go(e-1,0);
           C.add(e);
       blank[e-1]=0;
       cli(e);
       }
       else{
           if(blank[6]==-1){
           go(6,0);
           blank[6]=0;
           C.add(7);
           cli(7);
       }
       else{
           go(Make_2(0)-1,0);
       blank[Make_2(0)-1]=0;

       C.add(Make_2(0));
       System.out.println(Make_2(0));
       cli(Make_2(0));
       }
       }
   }
 }
   if(x==6){
   int d=PossWin(C);
   System.out.print(d);

   if(d!=0){
       go(d-1,0);
       C.add(d);
       blank[d-1]=0;
       cli(d);
             JOptionPane.showMessageDialog(this,"Computer Wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             cCount++;
             gameScore();
       
   }
   else{
       int e=PossWin(H);
       
       if(e!=0){
       go(e-1,0);
           C.add(e);
       blank[e-1]=0;
       cli(e);

   }
       else{
            int move= goAny(0);
        blank[move]=0;
        C.add(move+1);
        cli(move+1);

       }
   }
   }
   if(x==8){
   System.out.println("Move 9: Computer's Chance");
    int k=PossWin(C);

   if(k!=0){
       go(k-1,0);
       C.add(k);
       blank[k-1]=0;
       
       cli(k);
             JOptionPane.showMessageDialog(this,"Computer Wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             cCount++;
             gameScore();

   }
   else{
       int e=PossWin(H);
       
       if(e!=0){
       go(e-1,0);
           C.add(e);
       blank[e-1]=0;
       cli(e);

   }
       else{
            int move= goAny(0);
        blank[move]=0;
        C.add(move+1);
        cli(move+1);

       }
   }
   
     JOptionPane.showMessageDialog(this,"It's a Tie!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
     t++;
     tie.setText("Ties: "+t);
                        
       
 
}
    }
    public void game(int x){
        if(x==1){
            if(!H.contains(5)){
       if(go(4,0)){
           C.add(5);
           
           cli(5);
           blank[4]=0;
       }
   }
   else{
       if(go(0,0)){
           C.add(1);
           cli(1);
           blank[0]=0;
       }
       
   }
            
        }
        if(x==3){
            int k=PossWin(H);
   if(k!=0){
       go(k-1,0);
       C.add(k);
       cli(k);
       blank[k-1]=0;
       
       
   }
   else{
       int ma=Make_2(0);
       go(ma-1,0);
       blank[ma-1]=0;
       C.add(ma);
       cli(ma);
       System.out.println(ma);
       
   }
        }
        if(x==5){
       int b=PossWin(C);
   if(b!=0){
       go(b-1,0);
       C.add(b);
       blank[b-1]=0;
       cli(b);   

      JOptionPane.showMessageDialog(this,"Computer Wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
      cCount++;
      gameScore();
   }
   else{
       int o= PossWin(H);
       if(o!=0){
           
       go(o-1,0);
       C.add(o);
       
       blank[o-1]=0;
       cli(o);
       
   }
       else{
           int move= goAny(0);
           go(move,0);
           C.add(move+1);
           blank[move]=0;
           cli(move+1);
                  
       }
   }
   }
   if(x==7){
       int p= PossWin(C);
   if(p!=0){
       
       
       go(p-1,0);
       C.add(p);
       blank[p-1]=0;
       cli(p);
          
    JOptionPane.showMessageDialog(this,"Computer Wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    cCount++;
    gameScore();
   }
   else{
       int d=PossWin(H);
       if(d!=0){
       go(d-1,0);
           C.add(d);
       blank[d-1]=0;
       cli(d);   
   }
       else{
        int move= goAny(0);
        blank[move]=0;
        C.add(move+1);
        cli(move+1);
       }
         }
   }
   if(x==9){
    JOptionPane.showMessageDialog(this,"Its a Tie!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
     t++;
     tie.setText("Ties: "+t);

   }
    }
    public static boolean go(int i, int a){
     if(blank[i]==-1){
   blank[i]=a;
   return true;  
     }
     return false;
}
 public static int Make_2(int a){
     if(blank[4]==-1){
         go(4,a);
         return 5;
       }
      if(blank[0]==-1){
         go(0,a);
         return 1;
       }
       if(blank[2]==-1){
         go(2,a);
           System.out.println("Hey");
         return 3;
       }
        if(blank[6]==-1){
         go(6,a);
         return 7;
       }
         if(blank[8]==-1){
         go(8,a);
         return 9;
       }
       return 0;
 }
 public void cli(int k){
     if(k==1){
         bt1.doClick();
     }
     if(k==2){
         bt2.doClick();
     }
     if(k==3){
         bt3.doClick();
     }
     if(k==4){
         bt4.doClick();
     }
     if(k==5){
         bt5.doClick();
     }
     if(k==6){
         bt6.doClick();
     }
     if(k==7){
         bt7.doClick();
     }
     if(k==8){
         bt8.doClick();
     }
     if(k==9){
         bt9.doClick();
     }
 }
 @SuppressWarnings("rawtypes")
 public static int PossWin(List l){
     
     int len=l.size();
     int a;
     int b;
     int x;
     int y;
     int flag=0;
     for(int i=0;i<len-1;i++){
         for(int j=i+1;j<len;j++){
             a=(int)(l.get(i));
             b=(int)(l.get(j));
             x=magicSq[a-1]+magicSq[b-1];
             y=15-x;
             System.out.println(y);
             if(y>0 && y<10){
             if(blank[returnIndex(y)]==-1){
            System.out.println(returnIndex(y));
            flag=1;
            return returnIndex(y)+1;
     }
             }
             
         }
     }
     
     if(flag==0){
         return 0;
     }
     
     return 0;
 }
 
 
 public static int goAny(int a){
     for(int i=0;i<9;i++){
         if(blank[i]!=-1){
             continue;
         }
         else{
             return i;
             }          
     }
     return 0;
 }
 public static int[] magicSquare(){
     int num=3;
     int[][] arr=new int[num][num];
int i=num/2;
int j=num-1;

for(int x=0;x<num;x++){
	for(int y=0; y<num; y++){
		arr[x][y]=-1;
	}
}
int a=1;
// int k=0;
for( a=1; a<=num*num; ){
	if(i==-1 && j==num){
            j=num-2;
            i=0;
        }
        else{
            if(j==num ){
                j=0;
            }
            if(i==-1 ){
                i=num-1;
            }
        }
        
        if(arr[i][j]!=-1){
            j=j-2;
            i=i+1;
            continue;
            
        }
        else{
            arr[i][j]=a;
            a=a+1;
        }
        j=j+1;
        i=i-1;
}
int z=0;
for(int x=0;x<num;x++){
	for(int y=0; y<num; y++){
		magicSq[z]=arr[x][y];
                z++;
	}
	
}
   return magicSq;  
 }
 
 
 
 public static int returnIndex(int a){
     for(int i=0; i<9;i++){
         if(magicSq[i]==a)
             return i;
     }
     return -1;
 }

    public static int win(int l){
        int wi=PossWin(H);
        if(wi==l){
            return 1;
        }
        return 0;
    }
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbtnexit;
    private javax.swing.JButton jbtnreset;
    private javax.swing.JLabel jlblPlayerO;
    private javax.swing.JLabel jlblPlayerX;
    private javax.swing.JLabel lble;
    private javax.swing.JLabel tie;
}