package com.client.util;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

import com.client.bean.CarBrandCategory;

public class JPanelCarAdmin {
    private static JTable paramTable;
    private static final String[] paramColumnName = {"���", "��������", "��ע", "Ʒ��", "����", "�۸�", "�Ƿ����", "�Ƿ��ϼ�"};
    /**
     * ��ȡ��ǰ�б�ĳ������
     * @param objectList
     * @return
     */
    public static JPanel getJPanelCar(List<CarBrandCategory> objectList){

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout(5, 5));
        centerPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

        //��ͷ
        paramTable = createParamTable();

        // �����������Ĺ�������
        JScrollPane paramScrollPane = new JScrollPane(paramTable);
        centerPanel.add("Center", paramScrollPane);

        Object[][] paramRowData = null;
        if (objectList.isEmpty()) {
            paramRowData = new String[1][paramColumnName.length];
        } else {
            paramRowData = new Object[objectList.size()][paramColumnName.length];
            for (int i = 0; i < objectList.size(); i++) {
                CarBrandCategory cbc = objectList.get(i);
                paramRowData[i][0] = cbc.getCarId();
                paramRowData[i][1] = cbc.getModel();
                paramRowData[i][2] = cbc.getCarComments();
                paramRowData[i][3] = cbc.getBrand().getName();
                paramRowData[i][4] = cbc.getCategory().getName();
                paramRowData[i][5] = cbc.getRent();
                paramRowData[i][6] = (cbc.getStatus() == 0)? "��":"��";
                paramRowData[i][7] = (cbc.getUseable() == 0)? "���ϼ�":"δ�ϼ�";
            }
        }

        paramTable.setModel(new DefaultTableModel(paramRowData, paramColumnName));
        paramTable.setRowHeight(20);//�����и�
        return centerPanel;
    }

    /**
     * �����б��ʼ��
     *
     * @return
     */
    private static JTable createParamTable() {
        String[][] rowData = new String[1][paramColumnName.length];
        return new JTable(new DefaultTableModel(rowData, paramColumnName));
    }
}
