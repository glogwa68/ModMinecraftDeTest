
package net.mcreator.glogwa.world.features.ores;

public class MineraitoxFeature extends OreFeature {

	public static MineraitoxFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new MineraitoxFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("glogwa68:mineraitox", FEATURE,
				new OreConfiguration(MineraitoxFeatureRuleTest.INSTANCE, Glogwa68ModBlocks.MINERAITOX.get().defaultBlockState(), 5));
		PLACED_FEATURE = PlacementUtils.register("glogwa68:mineraitox", CONFIGURED_FEATURE, List.of(CountPlacement.of(5), InSquarePlacement.spread(),
				HeightRangePlacement.uniform(VerticalAnchor.absolute(7), VerticalAnchor.absolute(15))));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public MineraitoxFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class MineraitoxFeatureRuleTest extends RuleTest {

		static final MineraitoxFeatureRuleTest INSTANCE = new MineraitoxFeatureRuleTest();

		private static final com.mojang.serialization.Codec<MineraitoxFeatureRuleTest> CODEC = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		private static final RuleTestType<MineraitoxFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("glogwa68:mineraitox_match"), CUSTOM_MATCH);
		}

		private List<Block> base_blocks = null;

		public boolean test(BlockState blockAt, Random random) {
			if (base_blocks == null) {
				base_blocks = List.of(Blocks.STONE);
			}

			return base_blocks.contains(blockAt.getBlock());
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}

	}

}
