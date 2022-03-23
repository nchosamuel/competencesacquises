using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace WpfApp1
{
    /// <summary>
    /// Logique d'interaction pour MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        string Prenom = "Alain";
        string[] tableau1 = { "Kylian", "Arthur", "Miran", "Axel", "Mathéo", "Chloé", "Lucie", "Mathilde","Halilcan","Samuel","Hakan" };
        public MainWindow()
        {
            InitializeComponent();
        }

        private void bt_rechercher2_Click(object sender, RoutedEventArgs e)
        {
            int i; Boolean trouve;

            i = 0;
            trouve = false;

            while(i<=10 && trouve == false)
            {
                if(tableau1[i] == Prenom)
                {
                    trouve = true;
                }
                i++;
            }
            if (trouve == true)
            {
                MessageBox.Show("Trouvé");
            }
            else
            {
                MessageBox.Show("Absent"); 
            }
        }
    }
}
