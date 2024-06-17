package report;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class mainFrame extends JFrame {
    int fx, fy, sx, sy, minx, miny, width, height,select; //전역 정수 변수 설정
    boolean fillCheck = false; //채우기 설정 확인용 부울변수 선언
    Color color = Color.black; //컬러 변수 설정 추후 컬러 설정 대응 용
    public void menubar(){
        JMenuBar mb = new JMenuBar();
        JMenu filemenu = new JMenu("File");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem loadItem = new JMenuItem("Load");

        JCheckBoxMenuItem Pan = new JCheckBoxMenuItem("✎",true); //true 값으로 기본 설정
        JCheckBoxMenuItem Eraser = new JCheckBoxMenuItem("✐"); //일반 버튼으로 설정시 변수 변경이 안되어
        JCheckBoxMenuItem Line = new JCheckBoxMenuItem("─"); //부득이하게 체크박스로 설정함
        JCheckBoxMenuItem Rect = new JCheckBoxMenuItem("▢");
        JCheckBoxMenuItem Arc = new JCheckBoxMenuItem("◯");
        
        JCheckBoxMenuItem Checkfill = new JCheckBoxMenuItem("Fill Check");

        mb.add(filemenu); 
        mb.add(Pan);
        mb.add(Eraser);
        mb.add(Line,Rect);
        mb.add(Rect);
        mb.add(Arc);
        mb.add(Checkfill);
        filemenu.add(saveItem);//filemenu에 넣을 아이템
        filemenu.add(loadItem);
        Pan.addActionListener(new ActionListener(){
            @Override
                public void actionPerformed (ActionEvent e){
                    if(Pan.isSelected()) {
                        select = 0; //선택 하면 다른 메뉴는 비활성화
                        Eraser.setSelected(false); 
                        Line.setSelected(false);
                        Rect.setSelected(false);
                        Arc.setSelected(false);
                    }    
                }
            });
        Eraser.addActionListener(new ActionListener(){
            @Override
                public void actionPerformed(ActionEvent e){
                    if(Eraser.isSelected()) {
                        select = 1;
                        Pan.setSelected(false);
                        Line.setSelected(false);
                        Rect.setSelected(false);
                        Arc.setSelected(false);
                    }
                }
            });
        Line.addActionListener(new ActionListener(){
            @Override
                public void actionPerformed(ActionEvent e){
                    if(Line.isSelected()) {
                        select = 2;
                        Pan.setSelected(false);
                        Eraser.setSelected(false);
                        Rect.setSelected(false);
                        Arc.setSelected(false);
                    }
                }
            });
        Rect.addActionListener(new ActionListener(){
            @Override
                public void actionPerformed(ActionEvent e){
                    if(Rect.isSelected()) {
                        select = 3;
                        Pan.setSelected(false);
                        Eraser.setSelected(false);
                        Line.setSelected(false);
                        Arc.setSelected(false);
                    }
                }
            });
        Arc.addActionListener(new ActionListener(){
            @Override
                public void actionPerformed(ActionEvent e){
                    if(Arc.isSelected()) {
                        select = 4;
                        Pan.setSelected(false);
                        Eraser.setSelected(false);
                        Line.setSelected(false);
                        Rect.setSelected(false);
                    }
                }
            });
        Checkfill.addActionListener(new ActionListener(){
            @Override
                public void actionPerformed(ActionEvent e){
                    if(Checkfill.isSelected()) {
                        fillCheck = true; 
                    }
                    else fillCheck = false;
            }
        });
        saveItem.addActionListener(e -> saveImage()); // 세이브 및 로드 설정
        loadItem.addActionListener(e -> loadImage());
        this.setJMenuBar(mb);
    }
    class MyPanel extends JPanel implements MouseListener, MouseMotionListener {
        BufferedImage bufferedImage;
        public MyPanel() { // 도화지 크기 설정 및 사용할 함수 선언
            bufferedImage = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_ARGB);
            addMouseListener(this);
            addMouseMotionListener(this);
            setImageBackground(bufferedImage);
            Paint(); 
        }

        public void Paint() { 
            width = Math.abs(sx - fx);
            height = Math.abs(sy - fy);
            minx = Math.min(fx, sx);
            miny = Math.min(fy, sy);

            Graphics2D g = bufferedImage.createGraphics();
            g.setColor(color); //사용할 색을 불러옴
            switch (select) {  //메뉴바에서 설정한 값을 불러와 사용할 메뉴를 선택함
                case 0: // 펜
                    g.drawLine(fx, fy, sx, sy);
                    break;
                case 1: // 지우개
                    g.setColor(Color.white); //일반적인 그림판과 비슷하게 하양색으로 설정해서 지움.
                    g.drawLine(fx, fy, sx, sy);
                    break;
                case 2: // 라인(선)
                    g.drawLine(fx, fy, sx, sy); 
                    break;
                case 3: // 사각형
                    if (fillCheck) { //채우기 설정변화에 따른 대응
                        g.fillRect(minx, miny, width, height);
                    } else {
                        g.drawRect(minx, miny, width, height);
                    }
                    break;
                case 4: // 원형
                    if (fillCheck) { //채우기 설정변화에 따른 대응
                        g.fillOval(minx, miny, width, height);
                    } else {
                        g.drawOval(minx, miny, width, height);
                    }
                    break;
                }
                g.dispose();
                repaint();
        }
        public void paintComponent(Graphics g) { 
            super.paintComponent(g);
            g.drawImage(bufferedImage, 0, 0, null); //bufferedImage에서 그려진것을 paintComponent에 갱신
        }
        public void setImageBackground(BufferedImage bi) { //기본적인 배경 처리
            this.bufferedImage = bi;
            Graphics2D g = bufferedImage.createGraphics();
            g.setColor(Color.white);
            g.fillRect(0, 0, 1000, 1000);
            g.dispose();
        }
        @Override
        public void mousePressed(MouseEvent e) { //마우스 좌표값 초기화및 갱신
            fx = 0;
            fy = 0;
            sx = 0;
            sy = 0;

            fx = e.getX();
            fy = e.getY();
        }
        @Override
        public void mouseDragged(MouseEvent e) { //드래그시 높이 너비값 계산
            width = Math.abs(sx - fx);
            height = Math.abs(sy - fy);
            minx = Math.min(fx, sx);
            miny = Math.min(fy, sy);
            if (select <= 1) { //펜과 지우개만 해당하도록 설정
                if (sx != 0 && sy != 0) {
                    fx = sx;
                    fy = sy;
                }
                sx = e.getX();
                sy = e.getY();
                Paint();
            } else if (select == 2) {
                Graphics g = getGraphics();
                
                g.drawLine(fx, fy, sx, sy);
                sx = e.getX();
                sy = e.getY();
                g.dispose();
                repaint();
            } else if (select == 3) {
                Graphics g = getGraphics();

                g.setColor(color);
                g.setXORMode(getBackground());
                
                if (fillCheck) {
                    g.fillRect(minx, miny, width, height);
                } else {
                    g.drawRect(minx, miny, width, height);
                }
                sx = e.getX();
                sy = e.getY();
                g.dispose();
                repaint();
            } else if (select == 4) {
    
                Graphics g = getGraphics();
                g.setColor(color);
                g.setXORMode(getBackground());
                if (fillCheck) {
                    g.fillOval(minx, miny, width, height);
                } else {
                    g.drawOval(minx, miny, width, height);
                }
                sx = e.getX();
                sy = e.getY();
                
                g.dispose();
                repaint();
            }
        }
        public void mouseReleased(MouseEvent e) {
            if (select > 0 ){ //펜이 아닐경우 실행
                sx = e.getX();
                sy = e.getY();
                Paint();
            }
        }
        public void MouseListener(MouseEvent e){}
        public void MouseMotionListener(MouseEvent e){}
        public void mouseMoved(MouseEvent e) {}
        public void mouseClicked(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}

    }
    private void saveImage() { //이미지 저장처리
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("PNG Files", "png"));
        int result = fileChooser.showSaveDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                if (!file.getName().toLowerCase().endsWith(".png")) {
                    file = new File(file.getAbsolutePath() + ".png");
                }
                ImageIO.write(mypanel.bufferedImage, "png", file);
                System.out.println("Image saved successfully to: " + file.getAbsolutePath());
            } catch (IOException e) {
                System.out.println("Failed to save image: " + e.getMessage());
            }
        }
    }
    private void loadImage() { //이미지 로드처리
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png", "gif", "bmp"));
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                BufferedImage loadedImage = ImageIO.read(file);
                if (loadedImage != null) {
                    mypanel.bufferedImage = loadedImage;
                    mypanel.repaint();
                    System.out.println("Image loaded successfully from: " + file.getAbsolutePath());
                }
            } catch (IOException e) {
                System.out.println("Failed to load image: " + e.getMessage());
            }
        }
    }
    private MyPanel mypanel = new MyPanel();
    public mainFrame() {

        setTitle("그림판");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();

        container.setLayout(null);
        menubar();
        setContentPane(mypanel);
        setSize(1000,1000);
        setVisible(true);
    }
    public static void main(String[] args){
        mainFrame mainFrame = new mainFrame();
    }
}
