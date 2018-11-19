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
 * 用户查询汽车界面
 * @author Administrator
 *
 */
public class JPanelCar {

    private static JTable paramTable;
    private static final String[] paramColumnName = {"编号", "汽车名称", "备注", "品牌", "类型", "价格", "是否可租" };
    /**
     * `获得当前列表中所有车属性的面板
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
            paramRowData = new String[1][paramColumnName.length];//避免空指针
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
                paramRowData[i][6] = (cbc.getStatus() == 0)? "是":"否";
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
