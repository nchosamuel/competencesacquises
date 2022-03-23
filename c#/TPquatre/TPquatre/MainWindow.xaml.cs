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

namespace TPquatre
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

        int[] tab = new int[5];
        int[] Tentative = new int[5];
        int chiffrecompl;
        int numcompl;
        int chiffrecommun;
        int commun = 0;
        int gain6 = 1000000;
        int gain5 = 750000;
        int gain4 = 500000;
        int gain3 = 250000;
        int gain2 = 100000;
        int gain1 = 10;
        private void btn_tirage_Click(object sender, RoutedEventArgs e)
        {
            lb1.Items.Clear();
            lb2.Items.Clear();
            Random rnd = new Random();
            for (int i = 0; i < tab.Length; i++)
            {
                int nbAlea;
                do
                {
                    nbAlea = rnd.Next(1, 50);
                } while (tab.Contains(nbAlea));
                tab[i] = nbAlea;
                lb1.Items.Add(tab[i]);
            }
            Array.Sort(tab);
            for(int j = 0; j< tab.Length; j++)
            {
                lb2.Items.Add(tab[j]);
            }
            chiffrecompl = rnd.Next(1, 11);
            affichchiffrecompl.Text = chiffrecompl.ToString();
        }

        private void btAjouter_Click(object sender, RoutedEventArgs e)
        {
            lb3.Items.Clear();
            Tentative[0] = int.Parse(tbnum1.Text);
            Tentative[1] = int.Parse(tbnum2.Text);
            Tentative[2] = int.Parse(tbnum3.Text);
            Tentative[3] = int.Parse(tbnum4.Text);
            Tentative[4] = int.Parse(tbnum5.Text);
            numcompl = int.Parse(tbnumcompl.Text);
            affichnumcompl.Text = numcompl.ToString();
            int n = Tentative.Length - 1;
            int a;
            for (int i = n; i >= 0; i--)
                for (int j = 1; j <= i; j++)
                    if (Tentative[j - 1] > Tentative[j])
                    {
                        a = Tentative[j - 1];
                        Tentative[j - 1] = Tentative[j];
                        Tentative[j] = a;
                    }
            for (int j = 0; j < Tentative.Length; j++)
            {
                lb3.Items.Add(Tentative[j]);
            }
        }

        private void btcomparer_Click(object sender, RoutedEventArgs e)
        {
            chiffrecommun = 0;
            for(int i = 0; i<tab.Length; i++)
            {
                for(int j = 0; j< Tentative.Length; j++)
                {
                    if (tab[i] == Tentative[j])
                    {
                        chiffrecommun++;
                    }
                }
            }
            tbchifcommun.Text = "il y a " + chiffrecommun + " chiffre commun";
            commun = chiffrecommun;
            if (chiffrecompl == numcompl)
            {
                tbcomplementaire.Text = "Vous avez trouvé le bon chiffre complémentaire";
                commun = chiffrecommun + 1;
            }
            else
            {
                tbcomplementaire.Text = "Vous avez trouvé le mauvais chiffre complémentaire";
            }
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            switch (commun)
            {
                
                case 6:
                    lbl_gain.Content = "Vous avez gagner " + gain6 + "€";
                    break;
                case 5:
                    lbl_gain.Content = "Vous avez gagner " + gain5 + "€";
                    break;
                case 4:
                    lbl_gain.Content = "Vous avez gagner " + gain4 + "€";
                    break;
                case 3:
                    lbl_gain.Content = "Vous avez gagner " + gain3 + "€";
                    break;
                case 2:
                    lbl_gain.Content = "Vous avez gagner " + gain2 + "€";
                    break;
                case 1:
                    lbl_gain.Content = "Vous avez gagner " + gain1 + "€";
                    break;
                default:
                    lbl_gain.Content = "Vous avez gagner 0 €";
                    break;

            }
        }

        Boolean tabtrie (int[] tab1)
        {
            Boolean trie;
            int[] tab2 = new int[5];
            for (int i = 0; i<tab1.Length; i++)
            {
                tab1[i] = tab2[i];
            }
            Array.Sort(tab2);
            if(tab1 == tab2)
            {
                trie = true;
            }
            else
            {
                trie = false;
            }

            return trie;
        }

    }
}
