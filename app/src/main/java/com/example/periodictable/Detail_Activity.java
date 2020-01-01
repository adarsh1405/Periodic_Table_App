package com.example.periodictable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Detail_Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_);
        final ListView list = findViewById(R.id.list);
        ArrayList<String> arrayList = new ArrayList<>();

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        view_detail(message);
    }
    public void view_detail(String message)
    {
        String ename[] = {"Hydrogen", "Helium",
                "Lithium", "Beryllium", "Boron", "Carbon", "Nitrogen", "Oxygen", "Fluorine", "Neon",
                "Sodium", "Magnesium", "Aluminium", "Silicon", "Phosphorus", "Sulphur", "Chlorine", "Argon",
                "Potassium", "Calcium", "Scandium", "Titanium", "Vanadium", "Chromium", "Manganese", "Iron", "Cobalt", "Nickel", "Copper", "Zinc", "Gallium", "Germanium", "Arsenic", "Selenium", "Bromine", "Krypton",
                "Rubidium", "Strontium", "Yttrium", "Zirconium", "Niobium", "Molybdenum", "Technetium", "Ruthenium", "Rhodium", "Palladium", "Silver", "Cadmium", "Indium", "Tin", "Antimony", "Tellurium", "Iodine", "Xenon",
                "Cesium", "Barium", "Lanthanum", "Cerium", "Praseodymium", "Neodymium", "Promethium", "Samarium", "Europium", "Gadolinium", "Terbium", "Dysprosium", "Holmium", "Erbium", "Thulium", "Ytterbium", "Lutenium", "Hafnium", "Tantalum", "Tungsten", "Rhenium", "Osmium", "Iridium", "Platinum", "Gold", "Mercury", "Thallium", "Lead", "Bismuth", "Polonium", "Astatine", "Radon",
                "Francium", "Radium", "Actinium", "Thorium", "Protactinium", "Uranium", "Neptunium", "Plutonium", "Americium", "Curium", "Berkelium", "Californium", "Einteinium", "Fermium", "Un-nil-unium", "Un-nil-bium", "Un-nil-trium", "Un-nil-quadium", "Un-nil-pentium", "Un-nil-hexium", "Un-nil-septium", "Un-nil-octium", "Un-nil-enium", "Un-un-nilium", "Un-un-unium", "Un-un-bium", "Un-un-trium", "Un-un-quadium", "Un-un-pentium", "Un-un-hexium", "Un-un-septium", "Un-un-octium"};
        String symbol[] = {"H", "He",
                "Li", "Be", "B", "C", "N", "O", "F", "Ne",
                "Na", "Mg", "Al", "Si", "P", "S", "Cl", "Ar",
                "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr",
                "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe",
                "Cs", "Ba", "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu", "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn",
                "Fr", "Ra", "Ac", "Th", "Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Unu", "Unb", "Unt", "Unq", "Unp", "Unh", "Uns", "Uno", "Une", "Uun", "Uuu", "Uub", "Uut", "Uuq", "Uup", "Uuh", "Uus", "Uuo"};
        String group[] = {"I-A", "Zero",
                "I-A", "II-A", "III-A", "IV-A", "V-A", "VI-A", "VII-A", "Zero",
                "I-A", "II-A", "III-A", "IV-A", "V-A", "VI-A", "VII-A", "Zero",
                "I-A", "II-A", "III-B", "IV-B", "V-B", "VI-B", "VII-B", "VIII", "VIII", "VIII", "I-B", "II-B", "III-A", "IV-A", "V-A", "VI-A", "VII-A", "Zero",
                "I-A", "II-A", "III-B", "IV-B", "V-B", "VI-B", "VII-B", "VIII", "VIII", "VIII", "I-B", "II-B", "III-A", "IV-A", "V-A", "VI-A", "VII-A", "Zero",
                "I-A", "II-A",
                "III-B", "III-B", "III-B", "III-B", "III-B", "III-B", "III-B", "III-B", "III-B", "III-B", "III-B", "III-B", "III-B", "III-B", "III-B",
                "IV-B", "V-B", "VI-B", "VII-B", "VIII", "VIII", "VIII", "I-B", "II-B", "III-A", "IV-A", "V-A", "VI-A", "VII-A", "Zero",
                "I-A", "II-A",
                "III-B", "III-B", "III-B", "III-B", "III-B", "III-B", "III-B", "III-B", "III-B", "III-B", "III-B", "III-B", "III-B", "III-B", "III-B",
                "IV-B", "V-B", "VI-B", "VII-B", "VIII", "VIII", "VIII", "I-B", "II-B", "III-A", "IV-A", "V-A", "VI-A", "VII-A", "Zero"};
        int period[] = {1, 1,
                2, 2, 2, 2, 2, 2, 2, 2,
                3, 3, 3, 3, 3, 3, 3, 3,
                4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4,
                5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
                6, 6,
                6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6,
                6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6,
                7, 7,
                7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7,
                7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7};
        int atno[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18,
                19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36,
                37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54,
                55, 56,
                57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71,
                72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86,
                87, 88,
                89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103,
                104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118};
        int pro[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18,
                19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36,
                37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54,
                55, 56,
                57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71,
                72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86,
                87, 88,
                89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103,
                104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118};
        int elec[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18,
                19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36,
                37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54,
                55, 56,
                57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71,
                72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86,
                87, 88,
                89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103,
                104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118};
        int neu[] = {0, 2,
                4, 5, 6, 6, 7, 8, 10, 10,
                12, 12, 14, 14, 16, 16, 18, 22,
                20, 20, 24, 26, 28, 28, 30, 30, 32, 31, 34, 35, 39, 41, 42, 45, 45, 48,
                48, 50, 50, 51, 52, 54, 56, 57, 58, 60, 61, 64, 66, 69, 71, 76, 74, 77,
                78, 81,
                82, 82, 82, 84, 84, 88, 89, 93, 94, 96, 98, 99, 100, 103, 104,
                106, 108, 110, 111, 114, 115, 117, 118, 121, 123, 125, 126, 125, 125, 136,
                136, 138,
                138, 142, 140, 146, 144, 150, 148, 151, 150, 153, 155, 157, 157, 157, 157,
                157, 157, 157, 155, 157, 158, 159, 161, 165, 0, 184, 0, 0, 0, 175};
        double atwt[] = {1, 4,
                7, 9, 11, 12, 14, 16, 19, 20,
                23, 24, 27, 28, 31, 32, 35.5, 40,
                39, 40, 45, 48, 51, 52, 55, 56, 58.9, 58.6, 63.5, 65, 70, 73, 75, 79, 80, 84,
                85.5, 88, 89, 91, 93, 96, 99, 101, 103, 106.5, 108, 112.5, 115, 119, 122, 127.5, 126, 9, 131,
                133, 137,
                139, 140, 141, 144, 145, 150.5, 152, 157, 159, 162.5, 165, 167, 169, 173, 175,
                178.5, 181, 184, 186, 190, 192, 195, 197, 201, 204, 207, 208.9, 209, 210, 222,
                223, 226,
                227, 232, 231, 238, 237, 244, 243, 247, 247, 251, 254, 257, 258, 259, 260,
                261, 262, 263, 262, 265, 267, 269, 272, 277, 0, 298, 0, 0, 0, 293};
        String type[] = {"Non-Metal", "Inert Gas", "Alkali Metal", "Alkaline Earth Metal", "Semi-Metal", "Non-Metal", "Non-Metal", "Non-Metal", "Non-Metal", "Inert Gas",
                "Alkali Metal", "Alkaline Earth Metal", "Poor Metal", "Semi-Metal", "Non-Metal", "Non-Metal", "Non-Metal", "Inert Gas",
                "Alkali Metal", "Alkaline Earth Metal", "Transition Metal", "Transition Metal", "Transition Metal", "Transition Metal", "Transition Metal",
                "Transition Metal", "Transition Metal", "Transition Metal", "Transition Metal", "Transition Metal", "Poor Metal", "Semi-Metal", "Semi-Metal",
                "Semi-Metal", "Non-Metal", "Inert Gas",
                "Alkali Metal", "Alkaline Earth Metal", "Transition Metal", "Transition Metal", "Transition Metal", "Transition Metal", "Transition Metal",
                "Transition Metal", "Transition Metal", "Transition Metal", "Transition Metal", "Transition Metal", "Poor Metal", "Poor Metal", "Semi-Metal",
                "Semi-Metal", "Non-Metal", "Inert Gas",
                "Alkali Metal", "Alkaline Earth Metal",
                "Lanthanide", "Lanthanide", "Lanthanide", "Lanthanide", "Lanthanide", "Lanthanide", "Lanthanide", "Lanthanide", "Lanthanide", "Lanthanide",
                "Lanthanide", "Lanthanide", "Lanthanide", "Lanthanide", "Lanthanide",
                "Transition Metal", "Transition Metal", "Transition Metal", "Transition Metal", "Transition Metal", "Transition Metal", "Transition Metal",
                "Transition Metal", "Transition Metal", "Poor Metal", "Poor Metal", "Poor Metal", "Poor Metal", "Non-Metal", "Inert Gas",
                "Alkali Metal", "Alkaline Earth Metal",
                "Actinide", "Actinide", "Actinide", "Actinide", "Actinide", "Actinide", "Actinide", "Actinide", "Actinide", "Actinide", "Actinide", "Actinide",
                "Actinide", "Actinide", "Actinide",
                "Transition Metal", "Transition Metal", "Transition Metal", "Transition Metal", "Transition Metal", "Transition Metal", "Transition Metal",
                "Transition Metal", "Transition Metal", "Transition Metal", "Transition Metal", "Transition Metal", "Transition Metal", "Transition Metal", "Transition Metal", "Transition Metal",};


                TextView ele = findViewById(R.id.ele);
                TextView msg=findViewById(R.id.msg);

                 for(int i=0;i<symbol.length;i++) {
                 if(symbol[i].equals(message)) {
                    ele.setText(ename[i]);
                     msg.setText("Name:-"+ename[i] + "\n" +"Symbol:-"+symbol[i] + "\n"+ "Group:-"+ group[i]+ "\n"+ "Period:-"+ period[i]
                             + "\n"+ "Atomic Number:-"+ atno[i] + "\n"+ "Atomic Weight:-" + atwt[i]+ "\n"+ "Type:-" + type[i]+ "\n"+
                             "Protons:-"+ pro[i]	+"\n"+"Electrons:-"+ elec[i]+"\n" + "Neutrons:-"+ neu[i]);


                 }
                }

    }
}