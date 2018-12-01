package com.client.util;
import com.client.bean.Record;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
/**
 * �û���������ҳ
 * @author Administrator
 *
 */
public class JPanelRecord {
    private static JTable paramTable;
    private static final String[] paramColumnName = {"���", "�������" , "��������" ,"����ܶ�", "��ע", "Ʒ��", "����", "�賵ʱ��", "����ʱ��"};
    /**
     * ���ص�ǰ�б��Ļ�������
     * @param objectList
     * @return
     */
    public static JPanel getJPanelRecord(List<Record> objectList){

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout(5, 5));
        centerPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

        //��ͷ
        paramTable = createParamTable();

        // ������������Ĺ�������
        JScrollPane paramScrollPane = new JScrollPane(paramTable);
        centerPanel.add("Center", paramScrollPane);

        Object[][] paramRowData = null;
        if (objectList.isEmpty()) {
            paramRowData = new String[1][paramColumnName.length];//�����ָ��
        } else {
            paramRowData = new Object[objectList.size()][paramColumnName.length];
            for (int i = 0; i < objectList.size(); i++) {
                Record ruc = objectList.get(i);
                paramRowData[i][0] = i + 1;
                paramRowData[i][1] = ruc.getCarBrandCategory().getCarId();
                paramRowData[i][2] = ruc.getCarBrandCategory().getModel();
                paramRowData[i][3] = ruc.getRecordPayment();
                paramRowData[i][4] = ruc.getCarBrandCategory().getCarComments();
                paramRowData[i][5] = ruc.getCarBrandCategory().getBrand().getName();
                paramRowData[i][6] = ruc.getCarBrandCategory().getCategory().getName();
                paramRowData[i][7] = ruc.getRecordStartDate();
                paramRowData[i][8] = ruc.getRecordReturnDate();
            }
        }
        paramTable.setModel(new DefaultTableModel(paramRowData, paramColumnName));
        paramTable.setRowHeight(20);//�����и�
        return centerPanel;
    }

    /**
     * �����б���ʼ��
     *
     * @return
     */
    private static JTable createParamTable() {
        String[][] rowData = new String[1][paramColumnName.length];
        return new JTable(new DefaultTableModel(rowData, paramColumnName));
    }
}