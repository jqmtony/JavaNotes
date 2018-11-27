package com.client.util;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.client.bean.Record;

import java.awt.*;
import java.util.List;

public class JPanelRecordAdmin {
    private static JTable paramTable;
    private static final String[] paramColumnName = {"编号", "汽车编号" , "汽车名称" ,"租金总额", "备注", "品牌", "类型", "借车时间", "还车时间", "用户"};

    public static JPanel getJPanelRecord(List<Record> objectList){

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout(5, 5));
        centerPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

        //表头
        paramTable = createParamTable();

        // 创建包含表格的滚动窗格
        JScrollPane paramScrollPane = new JScrollPane(paramTable);
        centerPanel.add("Center", paramScrollPane);
        //设置表格宽度
        paramTable.getColumnModel().getColumn(4).setPreferredWidth(30);


        Object[][] paramRowData = null;
        if (objectList.isEmpty()) {
            paramRowData = new String[1][paramColumnName.length];
        } else {
            paramRowData = new Object[objectList.size()][paramColumnName.length];
            for (int i = 0; i < objectList.size(); i++) {
            	Record ruc = objectList.get(i);
                paramRowData[i][0] = ruc.getRecordId();
                paramRowData[i][1] = ruc.getCarBrandCategory().getCarId();
                paramRowData[i][2] = ruc.getCarBrandCategory().getModel();
                paramRowData[i][3] = ruc.getRecordPayment();
                paramRowData[i][4] = ruc.getCarBrandCategory().getCarComments();
                paramRowData[i][5] = ruc.getCarBrandCategory().getBrand().getName();
                paramRowData[i][6] = ruc.getCarBrandCategory().getCategory().getName();
                paramRowData[i][7] = ruc.getRecordStartDate();
                paramRowData[i][8] = ruc.getRecordReturnDate();
                paramRowData[i][9] = ruc.getRecordUserId();
                
            }
        }

        paramTable.setModel(new DefaultTableModel(paramRowData, paramColumnName) );
        paramTable.setRowHeight(20);//设置行高
        return centerPanel;
    }

    /**
     * 参数列表初始化
     *
     * @return
     */
    private static JTable createParamTable() {
        String[][] rowData = new String[1][paramColumnName.length];
        return new JTable(new DefaultTableModel(rowData, paramColumnName));
    }
}
