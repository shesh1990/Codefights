
//https://codefights.com/challenge/TrQgtxWgu6pArX7ui

package com.codefights.solutions;

import java.util.HashMap;
import java.util.Map;

public class AtomicCannon {

	public static void main(String[] args) {
		AtomicCannon cannon = new AtomicCannon();
		System.out.println(cannon.atomicCannon("nation"));
	}

	private String atomicCannon(String message) {
		int lengthOfMinimum[] = min(message);

		StringBuilder result = new StringBuilder();
		for (int index = 0; index < message.length();) {

			if (lengthOfMinimum[index] == 0) {
				return "Invalid";
			}

			result.append((char) (message.charAt(index) - 32));
			if (lengthOfMinimum[index] > 1)
				result.append(message.charAt(index + 1));
			result.append(" ");
			index = index + lengthOfMinimum[index];
		}

		return result.toString().substring(0, result.length() - 1);
	}

	private int[] min(String message) {
		int[] lengthOfMinimum = new int[message.length() + 1];
		int first = 0, second = 0;
		String[] elementSymbols = { "H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "S", "Cl",
				"Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se",
				"Br", "Kr", "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb",
				"Te", "I", "Xe", "Cs", "Ba", "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er",
				"Tm", "Yb", "Lu", "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At",
				"Rn", "Fr", "Ra", "Ac", "Th", "Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No",
				"Lr", "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", "Rg", "Cn", "Nh", "Fl", "Mc", "Lv", "Ts", "Og" };
		int atomicNumber = 1, defaultWeightForInvalidElementName = 10000000;
		Map<String, Integer> elementAtomicNumberMap = new HashMap();
		for (String elementSymbol : elementSymbols)
			elementAtomicNumberMap.put(elementSymbol, atomicNumber++);
		for (int start = message.length() - 1; start >= 0; start--) {
			int oneCharacterElement = defaultWeightForInvalidElementName, twoCharacterElement = oneCharacterElement;
			String name = (char) (message.charAt(start) - 32) + "", name2 = "";
			if (start < message.length() - 1) {
				name2 = name + message.charAt(start + 1);
			}
			if (elementAtomicNumberMap.containsKey(name)) {
				oneCharacterElement = elementAtomicNumberMap.get(name) + first;
			}
			if (elementAtomicNumberMap.containsKey(name2)) {
				twoCharacterElement = elementAtomicNumberMap.get(name2) + second;
			}
			second = first;
			first = Math.min(oneCharacterElement, twoCharacterElement);
			if (first < defaultWeightForInvalidElementName) {
				if (first == oneCharacterElement)
					lengthOfMinimum[start] = 1;
				else {
					lengthOfMinimum[start] = 2;
				}
			}

		}
		return lengthOfMinimum;

	}
}
