import React, { lazy, Suspense, useState } from "react";

const Dashboard = lazy(() => import("./dashboard"));
const lazyLoading = () => {
  const [showDashboard, setShowDashboard] = useState(false);
  return (
    <div>
      <button
        onClick={() => {
          setShowDashboard(true);
        }}
      >
        Open Dashboard
      </button>
      {showDashboard && (
        <Suspense fallback={<p> Loading Dashboard......</p>}>
          <Dashboard />
        </Suspense>
      )}
    </div>
  );
};

export default lazyLoading;
