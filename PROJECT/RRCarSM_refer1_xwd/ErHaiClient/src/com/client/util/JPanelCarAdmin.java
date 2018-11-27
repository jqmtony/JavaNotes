package com.client.util;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

import com.client.bean.CarBrandCategory;

public class JPanelCarAdmin {
    private static JTable paramTable;
    private static final String[] paramColumnName = {"编号", "汽车名称", "备注", "品牌", "类型", "价格", "是否可租", "是否上架"};
    /**
     * 获取当前列表的车的面板
     * @param objectList
     * @return
     */
    public static JPanel getJPanelCar(List<CarBrandCategory> objectList){

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout(5, 5));
        centerPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

        //表头
        paramTable = createParamTable();

        // 创建包含表格的滚动窗格
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
                paramRowData[i][6] = (cbc.getStatus() == 0)? "是":"否";
                paramRowData[i][7] = (cbc.getUseable() == 0)? "已上架":"未上架";
            }
        }

        paramTable.setModel(new DefaultTableModel(paramRowData, paramColumnName));
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
