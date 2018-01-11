
//https://codefights.com/challenge/TrQgtxWgu6pArX7ui

package com.codefights.solutions;

import java.util.HashMap;
import java.util.Map;

public class AtomicCannon {

	public static void main(String[] args) {
		AtomicCannon cannon = new AtomicCannon();
		String result1 = cannon.atomicCannon("nation");
		String result2 = cannon.atomicCannon(
				"pmcfnemdhecshssmganptapbatrapbishelibrparunedbnisisbascurbbhmoteftbmgrbcuarclpralrhatpdmchemc"
						+ "feogkrsrtaclclagcezrogsnnacekrtblriponifeybbrthrnkrgdosnhrhatprpanofeimcnbnznmnlisr"
						+ "sdypmuolrgalvspgdrflabetcybogptrhdbrncmcogacrgduzrifesrnathtlclfesmhscrhergsrieshgv"
						+ "hoeuaspbpopmalpakrnetscsnbrggasrznnahgmgznptgethbkcafedycelvnebkzrhgueukrogereupdpm"
						+ "mcnifthhuirlrfecebatmnbzrsicrbsbcssmbrhgafclrhsryznkrdyaspatsyaudsscpmacccaarnabana"
						+ "mtsogdbfoslanasbaerinsrtamocenotehescirsgnbmgkrmgybpulvcapdcorgacartbhginbibagdtbco"
						+ "runikrlutcsnfrbktisnhputsbethkerhetbamporfneputisitcnirxenedshgattlatnocrprlrhetiau"
						+ "fdsprfipmatndaghgiarndracalapucereermnrucehftarfliramtrgpmbhmnbepagaflybbifeuniythn"
						+ "ascoprnodsmcfebhfruwtliratcresybhgbeashscdyhcmybcawdygefmacbagebrgdsrflhfinhuaslrsi"
						+ "krauresgrnsbtarhtanhalrgclatpmobhfrbrtetbbhhfcrrfoglvbibrmnhskrxenhsbarnbkgaclarsrt"
						+ "sprsnuacbafmclnokmnhftmybybincnasmdsmcfbeonenduycerasgvprhccdseauesnaesdboftiregatsa"
						+ "czncundnamcclculrpreuthcdbitbcdlahsscspmacinaeunhrngaffeergdcrnacfbhmgcrasgdbksihffc"
						+ "mpadydbbitcsmcrtbpbndvptxenaasbesznkrfesngecmlidyhehegenanelucutseracsneugddsammckrp"
						+ "mhetmrhpbfmcfcscesbmosmupkrhstahofmfmxeprmgnobemccbkcmugathtinigasidbflotshnbnlrlrau"
						+ "rnsrndamtarafptbasbkrinhheuxelitaosybtmparascfascdbzragrnrbnarfcrpbpomdhgmokrscmdpbb"
						+ "ikrtbagnpatpthoatuosbetsgeogsnznclalirpmsntmsbbepmrgnpzrcucsnenhlrsbpobalvhmneubrtmp"
						+ "oautsagalcssratuluxetbznbkthnonartsprpdbmccabi");
		String expectedResult1 = "Na Ti O N";
		String expectedResult2 = "Pm C F Ne Md He C S H S Sm Ga N P Ta P B At Ra P B I S He Li Br P Ar U Ne Db Ni "
				+ "Si S B As Cu Rb B H Mo Te F Tb Mg Rb Cu Ar Cl Pr Al Rh At Pd Mc He Mc Fe Og Kr Sr Ta Cl Cl Ag "
				+ "Ce Zr Og S N Na Ce Kr Tb Lr I P O Ni Fe Y B Br Th Rn Kr Gd O S N H Rh At Pr Pa N O Fe I Mc N B"
				+ " N Zn Mn Li Sr S Dy Pm U O Lr Ga Lv S P Gd Rf La Be Tc Y B Og Pt Rh Db Rn Cm C O Ga Cr Gd U Zr"
				+ " I Fe Sr N At H Tl Cl Fe Sm H S Cr He Rg Sr I Es Hg V H O Eu As P B P O Pm Al Pa Kr Ne Ts C S "
				+ "N B Rg Ga Sr Zn Na Hg Mg Zn Pt Ge Th B K Ca Fe Dy Ce Lv Ne B K Zr Hg U Eu Kr O Ge Re U Pd Pm "
				+ "Mc Ni F Th H U Ir Lr Fe Ce B At Mn B Zr Si Cr B S B C S Sm Br H Ga F Cl Rh Sr Y Zn Kr Dy As P"
				+ " At S Y Au Ds Sc Pm Ac C Ca Ar Na Ba Na Mt S O Gd B F O S La Na S Ba Er In Sr Ta Mo Ce N O Te "
				+ "He Sc Ir Sg N B Mg Kr Mg Y B Pu Lv Ca Pd C O Rg Ac Ar Tb Hg In B I Ba Gd Tb C O Ru Ni Kr Lu Tc"
				+ " S N F Rb K Ti S N H Pu Ts Be Th K Er He Tb Am P O Rf Ne Pu Ti Si Tc N Ir Xe Ne Ds Hg At Tl At N"
				+ " O Cr Pr Lr He Ti Au F Ds Pr F I Pm At Nd Ag Hg I Ar Nd Ra Ca La Pu Ce Re Er Mn Ru Ce H F Ta Rf "
				+ "Li Ra Mt Rg Pm B H Mn Be Pa Ga Fl Y B B I F Eu Ni Y Th Na Sc O Pr N O Ds Mc Fe B H F Ru W Tl Ir "
				+ "At C Re S Y B Hg Be As H Sc Dy H Cm Y B Ca W Dy Ge Fm Ac Ba Ge Br Gd Sr Fl H F In H U As Lr Si "
				+ "Kr Au Re Sg Rn S B Ta Rh Ta N H Al Rg Cl At P Mo B H Fr Br Te Tb B H H F Cr Rf Og Lv B I Br Mn "
				+ "H S Kr Xe N H S B Ar N B K Ga Cl Ar Sr Ts Pr S N U Ac Ba Fm Cl N O K Mn H F Tm Y B Y B In C Na "
				+ "S Md Sm C F Be O Ne Nd U Y Ce Ra Sg V P Rh C Cd Se Au Es Na Es Db O F Ti Re Ga Ts Ac Zn Cu Nd N"
				+ " Am C Cl Cu Lr Pr Eu Th Cd B I Tb Cd La H S Sc S Pm Ac I Na Eu N H Rn Ga F Fe Er Gd Cr Na C F B"
				+ " H Mg Cr As Gd B K Si H F F Cm Pa Dy Db B I Tc Sm Cr Tb P B Nd V Pt Xe Na As Be S Zn Kr Fe S N "
				+ "Ge Cm Li Dy He He Ge Na Ne Lu Cu Ts Er Ac S N Eu Gd Ds Am Mc Kr Pm He Tm Rh P B Fm C F C S Ce S"
				+ " B Mo Sm U P Kr H S Ta H O Fm Fm Xe Pr Mg N O Be Mc C B K Cm U Ga Th Ti Ni Ga Si Db Fl O Ts H N"
				+ " B N Lr Lr Au Rn Sr Nd Am Ta Ra F P Tb As B Kr In H H Eu Xe Li Ta O S Y B Tm P Ar As C F As Cd "
				+ "B Zr Ag Rn Rb N Ar F Cr P B P O Md Hg Mo Kr Sc Md P B B I Kr Tb Ag N P At Pt H O At U O S Be Ts"
				+ " Ge Og S N Zn Cl Al Ir Pm S N Tm S B Be Pm Rg N P Zr Cu C S Ne N H Lr S B P O B Al V H Mn Eu Br"
				+ " Tm P O Au Ts Ag Al C S Sr At U Lu Xe Tb Zn B K Th N O N Ar Ts Pr Pd B Mc Ca B I";

		System.out.println(result1.equals(expectedResult1));
		System.out.println(result2.equals(expectedResult2));
	}

	private String atomicCannon(String message) {
		// Get array with Element length with optimum solution
		int lengthOfMinimum[] = min(message);

		StringBuilder result = new StringBuilder();

		for (int index = 0; index < message.length();) {
			// if element length at any index is 0, it means it's an invalid
			// element
			if (lengthOfMinimum[index] == 0) {
				return "Invalid";
			}

			// Convert the first char of Element to UpperCase
			result.append((message.charAt(index) + "").toUpperCase());

			// if the length of the element symbol is 2, append second character
			// in lowercase
			if (lengthOfMinimum[index] > 1)
				result.append(message.charAt(index + 1));

			// after each element symbol append one space
			result.append(" ");

			index = index + lengthOfMinimum[index];
		}
		// remove the extra space at last
		return result.deleteCharAt(result.length() - 1).toString();
	}

	private int[] min(String message) {
		int[] lengthOfMinimum = new int[message.length() + 1];
		int first = 0, second = 0;
		String[] E = { "H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "S", "Cl",
				"Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se",
				"Br", "Kr", "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb",
				"Te", "I", "Xe", "Cs", "Ba", "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er",
				"Tm", "Yb", "Lu", "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At",
				"Rn", "Fr", "Ra", "Ac", "Th", "Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No",
				"Lr", "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", "Rg", "Cn", "Nh", "Fl", "Mc", "Lv", "Ts", "Og" };

		int atomicNumber = 1, defaultWeightForInvalidElementName = 10000000;

		// Hashmap to access element symbol in 0(1)
		Map<String, Integer> elementAtomicNumberMap = new HashMap();

		for (String p : E)
			elementAtomicNumberMap.put(p, atomicNumber++);

		// for each character from end check if it results in optimum length,
		// if it result store the length of the symbol in dp table
		for (int start = message.length() - 1; start >= 0; start--) {
			int l = defaultWeightForInvalidElementName, r = l;
			String name = (char) (message.charAt(start) - 32) + "", name2 = "";
			if (start < message.length() - 1) {
				name2 = name + message.charAt(start + 1);
			}
			if (elementAtomicNumberMap.containsKey(name)) {
				l = elementAtomicNumberMap.get(name) + first;
			}
			if (elementAtomicNumberMap.containsKey(name2)) {
				r = elementAtomicNumberMap.get(name2) + second;
			}
			second = first;
			first = Math.min(l, r);
			if (first < defaultWeightForInvalidElementName) {
				if (first == l)
					lengthOfMinimum[start] = 1;
				else {
					lengthOfMinimum[start] = 2;
				}
			}

		}
		return lengthOfMinimum;

	}
}
