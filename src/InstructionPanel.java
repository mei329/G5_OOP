import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;
import javax.swing.border.Border;

public class InstructionPanel extends JPanel {
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 400;

	private JButton startButton;
	private JLabel yearANDtype, subject, notice;
	private JPanel titlePanel, noticePanel;

	public InstructionPanel() {
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		creaLabelComp();
		creaStartButton();
		creaTotalPanel();
	}

	public void creaLabelComp() {
		yearANDtype = new JLabel("�j�ǤJ�ǦҸդ��� - 109�Ǧ~�׫��w��ئҸո��D");
		subject = new JLabel("�����Ҭ�");
		notice = new JLabel("\n-�@���`�N�ƶ�-\n�Ҹծɶ��G\n�D���D�ơG\n-�ĳ������G\n�ĶL����\n�@���覡");

		titlePanel = new JPanel();
		titlePanel.add(yearANDtype);
		titlePanel.add(subject);

		Border border = BorderFactory.createLineBorder(Color.BLACK);
		noticePanel = new JPanel();
		noticePanel.add(notice);
		noticePanel.setBorder(border);

	}

	public void creaStartButton() {
		startButton = new JButton("Start");

	}

	public void creaTotalPanel() {
		setLayout(new BorderLayout());
		add(titlePanel, BorderLayout.NORTH);
		add(noticePanel, BorderLayout.CENTER);
		add(startButton, BorderLayout.SOUTH);

	}
}
