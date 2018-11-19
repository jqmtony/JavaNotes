package com.client.util;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.client.bean.CarBrandCategory;
/**
 * �û���ѯ��������
 * @author Administrator
 *
 */
public class JPanelCar {

    private static JTable paramTable;
    private static final String[] paramColumnName = {"���", "��������", "��ע", "Ʒ��", "����", "�۸�", "�Ƿ����" };
    /**
     * `��õ�ǰ�б������г����Ե����
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
            paramRowData = new String[1][paramColumnName.length];//�����ָ��
        } else {
            paramRowData = new Object[objectList.size()][paramColumnName.length];
            for (int i = 0; i < objectList.size(); i++) {
                CarBrandCategory cbc = objectList.get(i);
                paramRowData[i][0] = i + 1;
                paramRowData[i][1] = cbc.getModel();
                paramRowData[i][2] = cbc.getCarComments();
                paramRowData[i][3] = cbc.getBrand().getName();
                paramRowData[i][4] = cbc.getCategory().getName();
                paramRowData[i][5] = cbc.getRent();
                paramRowData[i][6] = (cbc.getStatus() == 0)? "��":"��";
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
