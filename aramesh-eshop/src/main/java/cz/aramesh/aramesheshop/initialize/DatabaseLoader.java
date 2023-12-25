package cz.aramesh.aramesheshop.initialize;

import cz.aramesh.aramesheshop.model.Category;
import cz.aramesh.aramesheshop.model.Product;
import cz.aramesh.aramesheshop.repository.CategoryRepository;
import cz.aramesh.aramesheshop.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@AllArgsConstructor
public class DatabaseLoader implements CommandLineRunner {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        Category catOne = new Category("svítidla", "Svítidlo je elektrický spotřebič sloužící k osvětlování.");
        Category catTwo = new Category("topení", "Topení je elektrický spotřebič sloužící k vytápění.");
        Product productOne = new Product("Stolní lampa TOLOMEO", "Stolní lampu Tolomeo Tavolo vytvořili Giancarlo " +
                "Fassina a Michele de Lucchi pro značku Artemide. Tolomeo patří do rodiny lamp, které jsou založeny " +
                "na konzolových konstrukcích. Známé pro svou zjednodušenou estetiku, snadno se s nimi manipuluje do " +
                "různých poloh. Tato malá stolní lampa se neliší a poskytuje pohodlnou a přizpůsobivou možnost pro " +
                "povrchy všech typů. Stolní lampa Tolomeo Micro Tavolo má dvoudílný konzolový rám se sadou drátěných " +
                "závěsů po délce hlavního sloupu. Tyto panty umožňují svítilně volný pohyb a také se může otáčet " +
                "kolem kruhové základny. K dispozici je difuzér ve tvaru misky, který lze podle potřeby nasměrovat " +
                "pomocí praktické smyčky na vnější straně. Rám je vyroben z leštěného hliníku, zatímco difuzor má " +
                "matný eloxovaný hliník. K dispozici jsou různé barvy, včetně přírodního kovu, lesklé zlaté nebo bílé" +
                " a lakované červené, černé, oranžové a modré.", new BigDecimal(7000));
    }
}
