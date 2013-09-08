package fr.tvbarthel.games.chasewhisply.model.inventory;


public class RecipeFactory {
	public static Recipe create(int inventoryItemType) {
		Recipe recipe = new Recipe();
		switch (inventoryItemType) {

			case InventoryItemInformation.TYPE_STEEL_BULLET:
				recipe.addIngredient(InventoryItemInformationFactory.create(InventoryItemInformation.TYPE_COIN), 25);
				recipe.addIngredient(InventoryItemInformationFactory.create(InventoryItemInformation.TYPE_BROKEN_HELMET_HORN), 5);
				break;

			case InventoryItemInformation.TYPE_GOLD_BULLET:
				recipe.addIngredient(InventoryItemInformationFactory.create(InventoryItemInformation.TYPE_COIN), 50);
				recipe.addIngredient(InventoryItemInformationFactory.create(InventoryItemInformation.TYPE_KING_CROWN), 1);
				break;
		}

		return recipe;
	}
}
