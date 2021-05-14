import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class RangePanel extends JPanel {
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 400;
	private static final int PANEL_WIDTH = 350;
	private static final int PANEL_HEIGHT = 70;

	private JLabel title;
	private JPanel modePanel, testPanel, yearPanel, subjectPanel, typePanel, degreePanel, countPanel, totalPanel;
	private JRadioButton mode_Review, mode_New;
	private JRadioButton test_GSAT, test_AST;
	private JCheckBox year_109, year_108;
	private JRadioButton subject_Chi, subject_Eng, subject_MathA, subject_MathB, subject_Geo, subject_His, subject_Civ,
			subject_Bio, subject_Che, subject_Phy;
	private JCheckBox type_Single, type_Multiple, type_Cloze;
	private JRadioButton degree_Easy, degree_Medium, degree_Hard;
	private JComboBox count;
	private JButton startBtn;

	/*
	 * CardLayout card = new CardLayout(); JPanel panel = new JPanel(card);
	 */

	public RangePanel() {
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		// setTitle("Range");
		startBtn = new JButton("�X�D");

		/*
		 * InstructionPage i = new InstructionPage(); panel.add(i, "Instruction");
		 */

		creaTitle();
		creaModeComp();
		creaTestComp();
		creaYearComp();
		creaSubjectComp();
		creaTypeComp();
		creaDegreeComp();
		creaCountComp();
		// creaStartBtn();
		creaTotalPanel();
	}

	public void creaTitle() {
		title = new JLabel("�Ҹսd��");
	}

	public void creaModeComp() {
		mode_Review = new JRadioButton("�Ʋ�");
		mode_New = new JRadioButton("���s�D��");

		ButtonGroup modeGroup = new ButtonGroup();
		modeGroup.add(mode_Review);
		modeGroup.add(mode_New);

		Border blMode = BorderFactory.createTitledBorder("�Ҧ�");

		modePanel = new JPanel();
		modePanel.add(mode_Review);
		modePanel.add(mode_New);
		modePanel.setBorder(blMode);
		modePanel.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
	}

	public void creaTestComp() {
		test_GSAT = new JRadioButton("�Ǵ�");
		test_AST = new JRadioButton("����");

		ButtonGroup testGroup = new ButtonGroup();
		testGroup.add(test_GSAT);
		testGroup.add(test_AST);

		Border blTest = BorderFactory.createTitledBorder("�Ҹն���");

		testPanel = new JPanel();
		testPanel.add(test_GSAT);
		testPanel.add(test_AST);
		testPanel.setBorder(blTest);
		testPanel.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
	}

	public void creaYearComp() {
		year_109 = new JCheckBox("109");
		year_108 = new JCheckBox("108");

		Border blYear = BorderFactory.createTitledBorder("�~��");

		yearPanel = new JPanel();
		yearPanel.add(year_109);
		yearPanel.add(year_108);
		yearPanel.setBorder(blYear);
		yearPanel.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));

	}

	public void creaSubjectComp() {
		subject_Chi = new JRadioButton("���");
		subject_Eng = new JRadioButton("�^��");
		subject_MathA = new JRadioButton("�ƾǥ�");
		subject_MathB = new JRadioButton("�ƾǤA");
		subject_Geo = new JRadioButton("�a�z");
		subject_His = new JRadioButton("���v");
		subject_Civ = new JRadioButton("����");
		subject_Bio = new JRadioButton("�ͪ�");
		subject_Che = new JRadioButton("�ƾ�");
		subject_Phy = new JRadioButton("���z");

		ButtonGroup subjectGroup = new ButtonGroup();
		subjectGroup.add(subject_Chi);
		subjectGroup.add(subject_Eng);
		subjectGroup.add(subject_MathA);
		subjectGroup.add(subject_MathB);
		subjectGroup.add(subject_Geo);
		subjectGroup.add(subject_His);
		subjectGroup.add(subject_Civ);
		subjectGroup.add(subject_Bio);
		subjectGroup.add(subject_Che);
		subjectGroup.add(subject_Phy);

		Border blSubject = BorderFactory.createTitledBorder("���");

		subjectPanel = new JPanel();
		subjectPanel.add(subject_Chi);
		subjectPanel.add(subject_Eng);
		subjectPanel.add(subject_MathA);
		subjectPanel.add(subject_MathB);
		subjectPanel.add(subject_Geo);
		subjectPanel.add(subject_His);
		subjectPanel.add(subject_Civ);
		subjectPanel.add(subject_Bio);
		subjectPanel.add(subject_Che);
		subjectPanel.add(subject_Phy);
		subjectPanel.setBorder(blSubject);
		subjectPanel.setPreferredSize(new Dimension(PANEL_WIDTH, 100));
	}

	public void creaTypeComp() {
		type_Single = new JCheckBox("����D");
		type_Multiple = new JCheckBox("�ƿ��D");
		type_Cloze = new JCheckBox("����D");

		Border blType = BorderFactory.createTitledBorder("�D��");

		typePanel = new JPanel();
		typePanel.add(type_Single);
		typePanel.add(type_Multiple);
		typePanel.add(type_Cloze);
		typePanel.setBorder(blType);
		typePanel.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
	}

	public void creaDegreeComp() {
		degree_Easy = new JRadioButton("��");
		degree_Medium = new JRadioButton("��");
		degree_Hard = new JRadioButton("��");

		ButtonGroup degreeGroup = new ButtonGroup();
		degreeGroup.add(degree_Easy);
		degreeGroup.add(degree_Medium);
		degreeGroup.add(degree_Hard);

		Border blDegree = BorderFactory.createTitledBorder("������");

		degreePanel = new JPanel();
		degreePanel.add(degree_Easy);
		degreePanel.add(degree_Medium);
		degreePanel.add(degree_Hard);
		degreePanel.setBorder(blDegree);
		degreePanel.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
	}

	public void creaCountComp() {
		count = new JComboBox();
		count.addItem("---�п��---");
		count.addItem(10);
		count.addItem(20);
		count.addItem(30);
		count.addItem(40);
		count.addItem(50);

		Border blCount = BorderFactory.createTitledBorder("�D��");

		countPanel = new JPanel();
		countPanel.add(count);
		countPanel.setBorder(blCount);
		countPanel.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
	}

	public void creaStartBtn(JPanel panel1) {

		class ClickListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				CardLayout card = (CardLayout) (panel1.getLayout());

				card.show(panel1, "Instruction");

			}
		}
		ActionListener btn = new ClickListener();
		startBtn.addActionListener(btn);
	}

	public void creaTotalPanel() {
		setLayout(new BorderLayout());
		totalPanel = new JPanel(new GridLayout(7, 1));

		add(title, BorderLayout.NORTH);
		totalPanel.add(modePanel);
		totalPanel.add(testPanel);
		totalPanel.add(yearPanel);
		totalPanel.add(subjectPanel);
		totalPanel.add(typePanel);
		totalPanel.add(degreePanel);
		totalPanel.add(countPanel);

		JScrollPane scrollPane = new JScrollPane(totalPanel);

		add(scrollPane, BorderLayout.CENTER);
		add(startBtn, BorderLayout.SOUTH);

	}

}
