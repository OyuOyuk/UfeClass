import "./Filter/FilterChildren.css";
import NameField from "./Filter/NameField";
import ColorDropDown from "./Filter/ColorDropDown";
import PriceMinMax from "./Filter/PriceMinMax";

function Filter({ colors, filters, setFilters }) {

  const updateFilter = (field, value) => {
    setFilters(prev => ({
      ...prev,
      [field]: value
    }));
  };

  return (
    <div className="container">
      <h2 id="FilterTitle">Filter</h2>

      <NameField value={filters.name} onChange={(e) =>
          updateFilter("name", e.target.value)
        }
      />

      <ColorDropDown allcolors={colors} value={filters.color} onChange={(e) =>
          updateFilter("color", e.target.value)
        }
      />

      <PriceMinMax min={filters.minPrice} max={filters.maxPrice} setMin={(e) =>
          updateFilter("minPrice", e.target.value)
        }
        setMax={(e) =>
          updateFilter("maxPrice", e.target.value)
        }
      />

    </div>
  );
}

export default Filter;