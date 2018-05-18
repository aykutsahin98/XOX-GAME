import javax.swing.JOptionPane;
public class oyun extends javax.swing.JFrame {
    String [] hucre=new String[9];   /*oyuncu ve bilgisayarın tıklama verilerini 
    bu dizi içerisinde tut mak için oluşturuldu*/
    String [] skorlardata=new String[10]; /*program kapatılmadıkça yeni oyuncular oynasın 
    ve skorlar bu dizi içerisinde tutulsun*/
    int i=0;/*skorlar tutulurken dizi değeri artırılsın*/
     String ad="";/*oynayan oyuncunun adı buraya kayıtolsun*/
     int bilgisayar_skor=0;/*bilgisayar skoru bu değişkende tutulsun*/
     int oyuncu_skor=0;/*oyuncu skoru bu değişende tutulsun*/
    public oyun() {
        initComponents();
        /*form açılır açılmaz çalışacak kodlar*/
        panel_oyun_alani.setVisible(false);
        panel_durum.setVisible(false);
        Panel_skorlar.setVisible(false);
        buton_sifirla.setVisible(false);
        /*oyuncu bilgileri haricindeki paneller görünmesin*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_oyuncu_bilgileri = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textfield_isim = new javax.swing.JTextField();
        buton_basla = new javax.swing.JButton();
        panel_oyun_alani = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        panel_durum = new javax.swing.JPanel();
        buton_yeni = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        label_oyuncu = new javax.swing.JLabel();
        label_bilgisayar = new javax.swing.JLabel();
        Panel_skorlar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        buton_sifirla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_oyuncu_bilgileri.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OyuncuBilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 3, 14), new java.awt.Color(255, 102, 0))); // NOI18N

        jLabel1.setText("İsminizi Girin");

        buton_basla.setText("BAŞLA");
        buton_basla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_baslaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_oyuncu_bilgileriLayout = new javax.swing.GroupLayout(panel_oyuncu_bilgileri);
        panel_oyuncu_bilgileri.setLayout(panel_oyuncu_bilgileriLayout);
        panel_oyuncu_bilgileriLayout.setHorizontalGroup(
            panel_oyuncu_bilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_oyuncu_bilgileriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(textfield_isim, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buton_basla)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panel_oyuncu_bilgileriLayout.setVerticalGroup(
            panel_oyuncu_bilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_oyuncu_bilgileriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_oyuncu_bilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textfield_isim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buton_basla, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_oyun_alani.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Oyun Alanı", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 3, 14), new java.awt.Color(255, 102, 0))); // NOI18N

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        b1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b1.setContentAreaFilled(false);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        b2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b2.setContentAreaFilled(false);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        b0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b0.setContentAreaFilled(false);
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        b8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b8.setContentAreaFilled(false);
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        b5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b5.setContentAreaFilled(false);
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        b3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b3.setContentAreaFilled(false);
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        b4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b4.setContentAreaFilled(false);
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        b7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b7.setContentAreaFilled(false);
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png"))); // NOI18N
        b6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b6.setContentAreaFilled(false);
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_oyun_alaniLayout = new javax.swing.GroupLayout(panel_oyun_alani);
        panel_oyun_alani.setLayout(panel_oyun_alaniLayout);
        panel_oyun_alaniLayout.setHorizontalGroup(
            panel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_oyun_alaniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_oyun_alaniLayout.createSequentialGroup()
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_oyun_alaniLayout.createSequentialGroup()
                        .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_oyun_alaniLayout.createSequentialGroup()
                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        panel_oyun_alaniLayout.setVerticalGroup(
            panel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_oyun_alaniLayout.createSequentialGroup()
                .addGroup(panel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_oyun_alaniLayout.createSequentialGroup()
                        .addGroup(panel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_oyun_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 44, Short.MAX_VALUE))
        );

        panel_durum.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DURUM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 3, 14), new java.awt.Color(255, 102, 0))); // NOI18N

        buton_yeni.setText("Yeniden Oyna");
        buton_yeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_yeniActionPerformed(evt);
            }
        });

        jLabel3.setText("Oyuncu");

        jLabel4.setText("Bilgisayar");

        label_oyuncu.setText("0");

        label_bilgisayar.setText("0");

        javax.swing.GroupLayout panel_durumLayout = new javax.swing.GroupLayout(panel_durum);
        panel_durum.setLayout(panel_durumLayout);
        panel_durumLayout.setHorizontalGroup(
            panel_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_durumLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buton_yeni)
                    .addGroup(panel_durumLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_oyuncu))
                    .addGroup(panel_durumLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_bilgisayar)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panel_durumLayout.setVerticalGroup(
            panel_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_durumLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(label_oyuncu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_durumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(label_bilgisayar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buton_yeni, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel_skorlar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SKORLAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 3, 14), new java.awt.Color(255, 102, 0))); // NOI18N

        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout Panel_skorlarLayout = new javax.swing.GroupLayout(Panel_skorlar);
        Panel_skorlar.setLayout(Panel_skorlarLayout);
        Panel_skorlarLayout.setHorizontalGroup(
            Panel_skorlarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_skorlarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        Panel_skorlarLayout.setVerticalGroup(
            Panel_skorlarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_skorlarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        buton_sifirla.setText("SIFIRLA");
        buton_sifirla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton_sifirlaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_oyuncu_bilgileri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_oyun_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_skorlar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(buton_sifirla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_durum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_oyuncu_bilgileri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_oyun_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_durum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buton_sifirla)
                        .addGap(29, 29, 29)
                        .addComponent(Panel_skorlar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   int say=0; /*kazanan yoksa kontrolü yamak için kullanılacak değerdir
   9 tıklama sonrasında berabere kalır*/
    private void buton_baslaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_baslaActionPerformed
       ad=textfield_isim.getText();/*ad ı textfieldan aldık*/
       /*oyun alanı panelini görünürlüğünü açtık*/
        panel_oyun_alani.setVisible(true);
       /* oyuncu bilgileri panelini görünsün ama içerisi değiştirilemesin*/
       panel_oyuncu_bilgileri.setEnabled(false); 
       textfield_isim.setEnabled(false);
       buton_basla.setEnabled(false);
       Panel_skorlar.setVisible(false);
       //verileri sıfırladık 
       bilgisayar_skor=0;
       oyuncu_skor=0;
       say=0;
       for(int i=0;i<9;i++)
       hucre[i]="";
       oyun_durum=true;       
    }//GEN-LAST:event_buton_baslaActionPerformed
  
   boolean oyun_durum=false; // oyun 9 adımdan önce biterse kontrolünü sağlamak için kullanılacak
   /*oyuncu ya da bilgisayarın kazanıp kazanmadığını kontrol eden fonksiyondur. 
   0 1 2
   3 4 5
   6 7 8 
   
   diye hücreleri düşünürsek 0 1 2 e x konulsa oyuncu, o konulursa bilgisayar kazanacaktır. 
   kontroller şunlar olur 0 1 2,3 4 5, 6 7 8, 0 3 6, 1 4 7 , 2 5 8 
   
   */ 
   public void kontrol(){
   oyun f= new oyun();// uyarı penceresi açılması içindir. 
   if(say<9){
       
   if(hucre[0]=="x"&hucre[3]=="x"&hucre[6]=="x" ||hucre[1]=="x"&hucre[4]=="x"&hucre[7]=="x" ||hucre[2]=="x"&hucre[5]=="x"&hucre[8]=="x"||hucre[0]=="x"&hucre[1]=="x"&hucre[2]=="x" ||hucre[3]=="x"&hucre[4]=="x"&hucre[5]=="x" ||hucre[6]=="x"&hucre[7]=="x"&hucre[8]=="x")
   {    
   JOptionPane.showMessageDialog(f, "Oyuncu kazandı"); //uyarı penceresi açılır
   oyuncu_skor++; // eğer oyuncu kazandıysa skorunuartırır
   oyun_durum=false; // oyun durum false olur oyun sonlandırma işlemleri için
   label_oyuncu.setText(String.valueOf(oyuncu_skor)); // label a yeni skoru yazılır. 
   }
   else if(hucre[0]=="o"&hucre[3]=="o"&hucre[6]=="o" ||hucre[1]=="o"&hucre[4]=="o"&hucre[7]=="o" ||hucre[2]=="o"&hucre[5]=="o"&hucre[8]=="o"||hucre[0]=="o"&hucre[1]=="o"&hucre[2]=="o" ||hucre[3]=="o"&hucre[4]=="o"&hucre[5]=="o" ||hucre[6]=="o"&hucre[7]=="o"&hucre[8]=="o")
   {       
       JOptionPane.showMessageDialog(f, "bilgisayar kazandı");
       bilgisayar_skor++;// eğer bilgisayar kazandıysa skorunuartırır
       oyun_durum=false; // oyun durum false olur oyun sonlandırma işlemleri için
       label_bilgisayar.setText(String.valueOf(bilgisayar_skor));   // label a yeni skoru yazılır. 
   }   
    }else if(say==9) /*eğer oyuncu ve bilgisayar oynama sayısı toplamı 9 geldi ise kazanan yoktur. */
            {
    JOptionPane.showMessageDialog(f, "kazanan yok");
    oyun_durum=false; // oyun durum false olur oyun sonlandırma işlemleri için
    }
    // oyun durum false olduğunda aşağıdaki şlemler yapılır
    /*durum paneli açılır, oyun alanı kapatılır, buton sifirla aktif hale gelir
    ki yeni bir oyuncu oynamak isterse diye*/
    if(oyun_durum==false) 
    {
    panel_durum.setVisible(true); 
    panel_oyun_alani.setVisible(false);
    buton_sifirla.setVisible(true);
    }
   
     
    }
   /* oyunumuz kullanıcı başlangıçlı bir oyundur.yani her zaman kullanıcı ilk baş
   layacak. Bunu geliştirebilrisiniz isterseniz*/
   
   /* Kullanıcı oynadı, sıra bilgisayardadır. 
   Her defa aynı kodu tekrar etmek yerine bilgisayar oyununu bir fonksiyon yaptık
   bilgisayar_oyna fonksiyonu çağrıldığında bilgisayar boş olan bir yere o harfi koymak zorunda
   */
    public void bilgisayar_oyna(){
        
     if(oyun_durum==true){ //oyun sonlanmadı ise bu işe başla
     int h =-1; boolean durum=false; 
     /*Bilgisayar 0 dan 8 e kadar rastgele bir yer seçer. (yapay zeka ile daha iyi bir yer seçmesi sağlanabilir bunun için ekstra kod gerekli)
     Daha önceden oynanan bir yere o ya da x konulmaması için tutulan sayıdaki 
     hucre dizisinin o indisinde bir x ya da o var mı kontrolü yapar*/
     do{
     h=(int)(Math.random()*9);
     if(hucre[h]=="x")         durum=false;
     else if(hucre[h]=="o")         durum=false;
     else          durum=true;
     }while(durum==false);
     /*Eğer o hücrede x ya da o yoksa tutulan h sayısının olduğu indekse bilgisayar
     o harfi koyar
     */
     hucre[h]="o"; // o harfi koydu hücre dizisine. 
     say++; //kazanan olmamama durumuna karşın adım saydı
     /* aşağıdaki kodlar da görsel olarak o butona o resmini getirmek içindir*/
if(h==0) {  b0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
            b0.setEnabled(false);   }
else if(h==1){ b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
                b1.setEnabled(false);     }    
else if(h==2) {  b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
                b2.setEnabled(false);     }
else if(h==3){  b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
         b3.setEnabled(false);     }
else if(h==4)      {      b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
         b4.setEnabled(false);      }
else if(h==5)      {      b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
         b5.setEnabled(false);      }
else if(h==6)      {      b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
         b6.setEnabled(false);      }
else if(h==7)      {      b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
         b7.setEnabled(false);      }
else if(h==8)      {      b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/O.png")));
         b8.setEnabled(false);      }
    /*Bilgisayar oynadıktan sonra kontrol işlemi çalışmalı ki kazanan bilgisayarda olabilri. */
     kontrol();
     }
    }
    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
       b0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
       //b0 butonuna kullanıcı tıkladıktan sonra x resmini koyar
       b0.setEnabled(false); //o butona bir daha ulaşılamamasını sağlar
       hucre[0]="x"; //hucre adlı diziye kullanıcının oynadığı bilgisi yazılır. 
       say++; ////kazanan olmamama durumuna karşın adım saydı
       /*Kullanıcı oynadıktan sonra kontrol işlemi çalışmalı ki kazanan kullanıcıda olabilri. */
       kontrol();
       /*kazanan yok ise sıra artık bilgisayarda dır*/
       bilgisayar_oyna();
    }//GEN-LAST:event_b0ActionPerformed
/*Bütün butonlarda aynı işlemler vardır. */
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
      b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
    b1.setEnabled(false);  
     hucre[1]="x";say++;
     kontrol();
     bilgisayar_oyna();
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
   b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
   b2.setEnabled(false);
   hucre[2]="x";
   say++;
   kontrol();
   bilgisayar_oyna();
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
   b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
   b3.setEnabled(false);    
   hucre[3]="x";
   say++;
   kontrol(); 
   bilgisayar_oyna();
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
  b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
   b4.setEnabled(false);      
   hucre[4]="x"; say++;
   kontrol();
   bilgisayar_oyna();  
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
   b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
   b5.setEnabled(false);    
   hucre[5]="x"; say++;
   kontrol();  
   bilgisayar_oyna();   
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
   b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
   b6.setEnabled(false);      
   hucre[6]="x";say++;
   kontrol();
   bilgisayar_oyna();
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
  b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
  b7.setEnabled(false);  
  hucre[7]="x"; say++;
  kontrol(); 
  bilgisayar_oyna(); 
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
  b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png")));
  b8.setEnabled(false); 
  hucre[8]="x"; say++;
  kontrol();
  bilgisayar_oyna();
       
    }//GEN-LAST:event_b8ActionPerformed
/*Bütün butonların arka plan resmini eski hle getirdik ki yeniden başla butonu
    ya sda sıfırla butonu altında ihtiyacımız olacak. Enable özelliklerinide 
    açtık*/
    public void butonsifirlafonk(){
b0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cicek.png")));
b0.setEnabled(true);b1.setEnabled(true);b2.setEnabled(true);b3.setEnabled(true);
b4.setEnabled(true);b5.setEnabled(true);b6.setEnabled(true);b7.setEnabled(true);
b8.setEnabled(true);

}
 /*Bütün kullanılan değişken dizi ve değerleri sıfırladık ki yeniden başla butonu
    ya sda sıfırla butonu altında ihtiyacımız olacak. oyun_durum değişkeni de 
    true oldu oyunun yeniden başlaması kontrol edildi*/   
public void degerlersifirlafonk(){
 for (int j = 0; j < 9; j++) {
            hucre[j]="";
            say=0;
        }
        oyun_durum=true;
}
/*yeniden başla butonu oyuncu ismini değiştirmeden aynı oyuncunun yeniden oynamasını sağlar*/
/*bu yüzden oyun alanı panelini açtık, butonları ve değerleri sıfırladık*/
    private void buton_yeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_yeniActionPerformed
       panel_oyun_alani.setVisible(true);
       butonsifirlafonk();
       degerlersifirlafonk();
       
    }//GEN-LAST:event_buton_yeniActionPerformed
/*Sıfırla butonu yeni bir oyuncu geleceği zaman çalışır 
    bu durumda butonları, değerleri ve panellerin başlangıç durumlarını sıfırlarız
    bununla birlikte Skorlar tablosuna ismi ve oyuncu skorunu kaydederiz*/
    private void buton_sifirlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton_sifirlaActionPerformed
        butonsifirlafonk();
        degerlersifirlafonk();
        skorlardata[i]=ad+"-"+oyuncu_skor;
        i++;
        ad="";
        Panel_skorlar.setVisible(true);
        panel_durum.setVisible(false);
        panel_oyun_alani.setVisible(false);
        panel_oyuncu_bilgileri.setVisible(true);
        textfield_isim.setEnabled(true);
        buton_basla.setEnabled(true);
        jList1.setListData(skorlardata);
        
       buton_sifirla.setVisible(false);
        
    }//GEN-LAST:event_buton_sifirlaActionPerformed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new oyun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_skorlar;
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton buton_basla;
    private javax.swing.JButton buton_sifirla;
    private javax.swing.JButton buton_yeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_bilgisayar;
    private javax.swing.JLabel label_oyuncu;
    private javax.swing.JPanel panel_durum;
    private javax.swing.JPanel panel_oyun_alani;
    private javax.swing.JPanel panel_oyuncu_bilgileri;
    private javax.swing.JTextField textfield_isim;
    // End of variables declaration//GEN-END:variables
}
