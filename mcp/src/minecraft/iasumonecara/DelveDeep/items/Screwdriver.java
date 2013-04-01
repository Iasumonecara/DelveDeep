package iasumonecara.DelveDeep.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Screwdriver extends Item {

        public Screwdriver(int id) {
                super(id);
                
                // Constructor Configuration
                maxStackSize = 64;
                setCreativeTab(CreativeTabs.tabMisc);
                setUnlocalizedName("Screwdriver");
        }
        

        public void updateIcons(IconRegister iconRegister) {
        	iconIndex = iconRegister.registerIcon("DelveDeep:Screwdriver");
        }     

       }