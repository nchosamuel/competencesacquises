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

namespace TP1
{
    /// <summary>
    /// Logique d'interaction pour MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        char[] alphabet = new char[] { 'a', 'b', 'c', 'd', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        private void btn_chiffrer_Click(object sender, RoutedEventArgs e)
        {
            string mot = tb_mot.Text;
            string resultat = "";
            for(int i = 0; i<mot.Length;i++)
            {
                MessageBox.Show(mot.Substring(i, 1));
                string let1 = mot.Substring(i, 1);
                char lettr = Char.Parse(let1);
                for (int y = 0; y < alphabet.Length; y++)
                {
                    if (lettr == alphabet[y])
                    {
                        lettr = alphabet[y + 3];
                    }
                }
                resultat = resultat + lettr;
            }
            tb_resultat.Text = resultat;
        }
    }
}
