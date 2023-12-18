/*
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductCategory {
    private long productCatId;
    private String name;
    private long parentId;
    private int label;

    @Override
    public String toString() {
        return "ProductCategory{" +
                "productCatId=" + productCatId +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                ", label=" + label +
                '}';
    }

    public long getProductCatId() {
        return productCatId;
    }

    public void setProductCatId(long productCatId) {
        this.productCatId = productCatId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public int getLabel() {
        return label;
    }

    public void setLabel(int label) {
        this.label = label;
    }

    public ProductCategory(long productCatId, String name, long parentId, int label) {
        this.productCatId = productCatId;
        this.name = name;
        this.parentId = parentId;
        this.label = label;
    }

    public static List<ProductCategory> generateDummyData() {
        List<ProductCategory> productCategories = new ArrayList<>();
        // Create top-level categories
        ProductCategory category1 = new ProductCategory(1, "Category 1", 0, 0);
        ProductCategory category2 = new ProductCategory(2, "Category 2", 0, 0);
        ProductCategory category3 = new ProductCategory(3, "Category 3", 0, 0);
        ProductCategory category4 = new ProductCategory(4, "Category 4", 0, 0);
        ProductCategory category5 = new ProductCategory(5, "Category 5", 0, 0);

        // Create sub-categories for the first layer
        ProductCategory subCategory1_1 = new ProductCategory(6, "Subcategory 1.1", 1, 1);
        ProductCategory subCategory1_2 = new ProductCategory(7, "Subcategory 1.2", 1, 1);
        ProductCategory subCategory2_1 = new ProductCategory(8, "Subcategory 2.1", 2, 1);
        ProductCategory subCategory2_2 = new ProductCategory(9, "Subcategory 2.2", 2, 1);
        ProductCategory subCategory3_1 = new ProductCategory(10, "Subcategory 3.1", 3, 1);
        ProductCategory subCategory3_2 = new ProductCategory(11, "Subcategory 3.2", 3, 1);
        ProductCategory subCategory4_1 = new ProductCategory(12, "Subcategory 4.1", 4, 1);
        ProductCategory subCategory4_2 = new ProductCategory(13, "Subcategory 4.2", 4, 1);
        ProductCategory subCategory5_1 = new ProductCategory(14, "Subcategory 5.1", 5, 1);
        ProductCategory subCategory5_2 = new ProductCategory(15, "Subcategory 5.2", 5, 1);

        // Create sub-categories for the second layer
        ProductCategory subSubCategory1_1_1 = new ProductCategory(16, "Sub-subcategory 1.1.1", 6, 2);
        ProductCategory subSubCategory1_1_2 = new ProductCategory(17, "Sub-subcategory 1.1.2", 6, 2);
        ProductCategory subSubCategory1_2_1 = new ProductCategory(18, "Sub-subcategory 1.2.1", 7, 2);
        ProductCategory subSubCategory1_2_2 = new ProductCategory(19, "Sub-subcategory 1.2.2", 7, 2);
        ProductCategory subSubCategory2_1_1 = new ProductCategory(20, "Sub-subcategory 2.1.1", 8, 2);
        ProductCategory subSubCategory2_1_2 = new ProductCategory(21, "Sub-subcategory 2.1.2", 8, 2);
        ProductCategory subSubCategory2_2_1 = new ProductCategory(22, "Sub-subcategory 2.2.1", 9, 2);
        ProductCategory subSubCategory2_2_2 = new ProductCategory(23, "Sub-subcategory 2.2.2", 9, 2);

        ProductCategory subSubCategory1_1_1_1 = new ProductCategory(24, "Sub-sub-subcategory 1.1.1.1", 16, 3);
        ProductCategory subSubCategory1_1_1_2 = new ProductCategory(25, "Sub-sub-subcategory 1.1.1.2", 16, 3);
        ProductCategory subSubCategory1_2_1_1 = new ProductCategory(26, "Sub-sub-subcategory 1.2.1.1", 18, 3);

        productCategories.add(category1);
        productCategories.add(category2);
        productCategories.add(category3);
        productCategories.add(category4);
        productCategories.add(category5);
        productCategories.add(subCategory1_1);
        productCategories.add(subCategory1_2);
        productCategories.add(subCategory2_1);
        productCategories.add(subCategory2_2);
        productCategories.add(subCategory3_1);
        productCategories.add(subCategory3_2);
        productCategories.add(subCategory4_1);
        productCategories.add(subCategory4_2);
        productCategories.add(subCategory5_1);
        productCategories.add(subCategory5_2);
        productCategories.add(subSubCategory1_1_1);
        productCategories.add(subSubCategory1_1_2);
        productCategories.add(subSubCategory1_2_1);
        productCategories.add(subSubCategory1_2_2);
        productCategories.add(subSubCategory2_1_1);
        productCategories.add(subSubCategory2_1_2);
        productCategories.add(subSubCategory2_2_1);
        productCategories.add(subSubCategory2_2_2);
        productCategories.add(subSubCategory1_1_1_1);
        productCategories.add(subSubCategory1_1_1_2);
        productCategories.add(subSubCategory1_2_1_1);

        return productCategories;
    }

   */
/* public static Map<Long, Object> buildProductCategoryMap(List<ProductCategory> productCategories) {
        Map<Long, Object> productCatMap = new HashMap<>();

        // Create a map for quick access by ID
        Map<Long, ProductCategory> productCategoryMap = new HashMap<>();
        for (ProductCategory category : productCategories) {
            productCategoryMap.put(category.getProductCatId(), category);
        }

        // Build the nested structure recursively
        for (ProductCategory category : productCategories) {
            if (category.getParentId() == 0) {
                // This is a top-level category
                productCatMap.put(category.getProductCatId(), new HashMap<Long, Object>());
            } else {
                // This is a sub-category
                addToParent(productCatMap, category, productCategoryMap);
            }
        }

        System.out.println(productCatMap);

        return productCatMap;
    }

    private static void addToParent(Map<Long, Object> productCatMap, ProductCategory category, Map<Long, ProductCategory> productCategoryMap) {
        ProductCategory parent = productCategoryMap.get(category.getParentId());
        if (parent != null) {
            long parentId = parent.getProductCatId();
            if (!productCatMap.containsKey(parentId)) {
                productCatMap.put(parentId, new HashMap<Long, Object>());
            }
            Map<Long, Object> parentMap = (Map<Long, Object>) productCatMap.get(parentId);

            // Check if the category does not exist in the parent map
            if (!parentMap.containsKey(category.getProductCatId())) {
                parentMap.put(category.getProductCatId(), new HashMap<Long, Object>());
                addToParent(parentMap, category, productCategoryMap);
            }

            System.out.println(productCatMap);
        }
    }

    public static void main(String[] args) {
        List<ProductCategory> dummyData = generateDummyData();
        Map<Long, Object> productCatMap = ProductCategory.buildProductCategoryMap(dummyData);
        System.out.println(productCatMap);
    }
}*//*



    public static Map<Long, Object> buildProductCategoryMap(List<ProductCategory> productCategories) {
        Map<Long, Object> productCatMap = new HashMap<>();
        Map<Long, List<ProductCategory>> categoryMap = new HashMap<>();

        // Create a map for quick access by ID and group categories by parent
        for (ProductCategory category : productCategories) {
            categoryMap.computeIfAbsent(category.getParentId(), k -> new ArrayList<>()).add(category);
        }

        // Build the nested structure iteratively
        for (ProductCategory category : productCategories) {
            if (category.getParentId() == 0) {
                productCatMap.put(category.getProductCatId(), new HashMap<Long, Object>());
            } else {
                addToParent(productCatMap, category, categoryMap);
            }
        }

        return productCatMap;
    }

    private static void addToParent(Map<Long, Object> productCatMap, ProductCategory category, Map<Long, List<ProductCategory>> categoryMap) {
        long parentId = category.getParentId();
        Map<Long, Object> parentMap = productCatMap;

        while (parentId != 0) {
            if (parentMap.containsKey(parentId)) {
                parentMap = (Map<Long, Object>) parentMap.get(parentId);
                parentId = categoryMap.get(parentId).get(0).getParentId();
            } else {
                // Handle missing parent in the hierarchy
                break;
            }
        }

        parentMap.put(category.getProductCatId(), new HashMap<Long, Object>());
    }



    public static void main(String[] args) {
        List<ProductCategory> dummyData = generateDummyData();
        Map<Long, Object> productCatMap = ProductCategory.buildProductCategoryMap(dummyData);
        System.out.println(productCatMap);
    }
}*/


import java.util.*;

public class ProductCategory {
    private int id;
    private String name;
    private int parentId;
    private List<ProductCategory> subcategories;

    @Override
    public String toString() {
        return "ProductCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                ", subcategories=" + subcategories +
                '}';
    }

    public ProductCategory(int id, String name, int parentId) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.subcategories = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getParentId() {
        return parentId;
    }

    public List<ProductCategory> getSubcategories() {
        return subcategories;
    }

    public void addSubcategory(ProductCategory subcategory) {
        subcategories.add(subcategory);
    }

    public static List<ProductCategory> buildCategoryHierarchy(List<ProductCategory> productCategories) {
        Map<Integer, ProductCategory> categoryMap = new HashMap<>();
        List<ProductCategory> topLevelCategories = new ArrayList<>();

        // Build a map of categories with their IDs as keys
        for (ProductCategory category : productCategories) {
            categoryMap.put(category.getId(), category);
        }

        // Create the hierarchy by linking categories to their parent
        for (ProductCategory category : productCategories) {
            int parentId = category.getParentId();
            if (parentId == 0) {
                // Top-level category
                topLevelCategories.add(category);
            } else {
                // Subcategory
                ProductCategory parentCategory = categoryMap.get(parentId);
                if (parentCategory != null) {
                    parentCategory.addSubcategory(category);
                }
            }
        }

        return topLevelCategories;
    }


    public static void main(String[] args) {
        List<ProductCategory> productCategories = generateDummyData();

        System.out.println(buildCategoryHierarchy(productCategories));
        // Print the hierarchy
      //  printCategoryWithSubcategories(topLevelCategories, 0);
    }

    public static List<ProductCategory> generateDummyData() {
        List<ProductCategory> productCategories = new ArrayList<>();

        productCategories.add(new ProductCategory(1, "Category 1", 0));
        productCategories.add(new ProductCategory(2, "Category 2", 0));
        productCategories.add(new ProductCategory(3, "Category 3", 0));
        productCategories.add(new ProductCategory(4, "Subcategory 1.1", 1));
        productCategories.add(new ProductCategory(5, "Subcategory 1.2", 1));
        productCategories.add(new ProductCategory(6, "Subcategory 2.1", 2));
        productCategories.add(new ProductCategory(7, "Subcategory 2.2", 2));
        productCategories.add(new ProductCategory(8, "Sub-subcategory 1.1.1", 4));
        productCategories.add(new ProductCategory(9, "Sub-subcategory 1.1.2", 4));
        productCategories.add(new ProductCategory(10, "Sub-subcategory 2.1.1", 6));
        productCategories.add(new ProductCategory(11, "Sub-subcategory 2.1.2", 6));

        return productCategories;
    }

    public static void printCategoryWithSubcategories(List<ProductCategory> categories, int depth) {
        for (ProductCategory category : categories) {
            StringBuilder indent = new StringBuilder();
            for (int i = 0; i < depth; i++) {
                indent.append("  ");
            }
            System.out.println(indent + category.getName());

            if (category.getSubcategories() != null) {
                printCategoryWithSubcategories(category.getSubcategories(), depth + 1);
            }
        }
    }
}

