package Vista;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;

public class JPDarDeAlta extends JPanel {
	private JTextField txtNombre;
	private JLabel lblSinopsis;
	private JTextField txtSinopsis;
	private JButton btnDarDeAlta;
	private JPanel panel;
	private JButton btnAyuda;
	private JComboBox comboBox;

	/**
	 * Create the panel.
	 */
	public JPDarDeAlta() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{86, 283, 0, 0};
		gridBagLayout.rowHeights = new int[]{57, 0, 0, 0, 0, 0, 28, 68, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 1;
		add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 1;
		gbc_txtNombre.gridy = 1;
		add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblGenero = new GridBagConstraints();
		gbc_lblGenero.anchor = GridBagConstraints.EAST;
		gbc_lblGenero.insets = new Insets(0, 0, 5, 5);
		gbc_lblGenero.gridx = 0;
		gbc_lblGenero.gridy = 3;
		add(lblGenero, gbc_lblGenero);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 3;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{118, 61, 184, 0};
		gbl_panel.rowHeights = new int[]{0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 0, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 0;
		gbc_comboBox.gridy = 0;
		panel.add(comboBox, gbc_comboBox);
		
		btnAyuda = new JButton("?");
		btnAyuda.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_btnAyuda = new GridBagConstraints();
		gbc_btnAyuda.insets = new Insets(0, 0, 0, 5);
		gbc_btnAyuda.gridx = 1;
		gbc_btnAyuda.gridy = 0;
		panel.add(btnAyuda, gbc_btnAyuda);
		
		lblSinopsis = new JLabel("Sinopsis:");
		lblSinopsis.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblSinopsis = new GridBagConstraints();
		gbc_lblSinopsis.anchor = GridBagConstraints.EAST;
		gbc_lblSinopsis.insets = new Insets(0, 0, 5, 5);
		gbc_lblSinopsis.gridx = 0;
		gbc_lblSinopsis.gridy = 5;
		add(lblSinopsis, gbc_lblSinopsis);
		
		txtSinopsis = new JTextField();
		GridBagConstraints gbc_txtSinopsis = new GridBagConstraints();
		gbc_txtSinopsis.gridheight = 2;
		gbc_txtSinopsis.insets = new Insets(0, 0, 5, 5);
		gbc_txtSinopsis.fill = GridBagConstraints.BOTH;
		gbc_txtSinopsis.gridx = 1;
		gbc_txtSinopsis.gridy = 5;
		add(txtSinopsis, gbc_txtSinopsis);
		txtSinopsis.setColumns(10);
		
		btnDarDeAlta = new JButton("Dar de alta");
		GridBagConstraints gbc_btnDarDeAlta = new GridBagConstraints();
		gbc_btnDarDeAlta.anchor = GridBagConstraints.EAST;
		gbc_btnDarDeAlta.insets = new Insets(0, 0, 0, 5);
		gbc_btnDarDeAlta.gridx = 1;
		gbc_btnDarDeAlta.gridy = 7;
		add(btnDarDeAlta, gbc_btnDarDeAlta);

	}

}
